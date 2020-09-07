fun sayHello() = println("Well, Unit Type")
val message: Unit = sayHello()
//val message: String = sayHello() -> This does not work
println(message)
println("Then result of sayHello is $message")