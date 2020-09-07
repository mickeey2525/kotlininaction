fun greet(name:String, msg:String="Hello"):String = "$msg $name"

println(greet(name="Eve"))
println(greet(name = "Eve",msg="Hi"))