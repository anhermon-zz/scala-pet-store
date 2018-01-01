import model.Pet
import org.http4s._
import org.http4s.dsl._
import io.circe._
import io.circe.generic.auto._
import io.circe.syntax._
import org.http4s._
import org.http4s.circe._
import org.http4s.dsl._

import scala.collection.mutable.ListBuffer


object PetStoreController {
//var stands vor variable
//val is constant

  var pets = Map[Int, Pet]()

  val petStoreService = HttpService {
    case GET -> Root / "pets" / id =>
      Ok(pets(id.toInt).asJson)
    case GET -> Root / "pets" =>
      Ok(pets.toMap.asJson)
    case DELETE -> Root / "pets" / id => {
      pets = pets.filterKeys(_ != id.toInt)
      Ok(pets.toMap.asJson)
    }
    case req @ POST -> Root / "pets" => {
      var option = req.as(jsonOf[Pet]).unsafeAttemptValue()
      option.foreach( attempt => {
        attempt.foreach( pet => {
          pets += pet.id -> pet
        })
      })
      Ok(pets.toMap.asJson)
    }
  }
}
