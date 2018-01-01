package model


//The "case" word is analogous to the switch statement in Java,
// though more flexible. It means that the class has an extra mechanism for pattern matching,
// as well as other things, amongst which is a factory method to create instances
// (no need to use the "new" keyword to create one). Similarly there is no need to create default getters.
// Unlike Java the variables are public by default (not protected) and Scala creates a getter for public variables
// named after the name of the variable itself. You could make fields mutable and/or private
// if you wanted to by using "var" in front of the parameters (e.g. case class Person(private var name:String)).
case class Pet(id : Int, name: String) {}
