fun nickName(name:String?): String{
    if (name == "William") {
        return "Bill"
    }
    /*
    if (name != null) {
        return name.reversed()
    }
    This could be rewritten like below
     */
    //return name?.reversed()?.toUpperCase()
    //val result = name?.reversed()?.toUpperCase()
    //return if(result == null) "Joker" else result
    //Using Elvis operator, you don't have write temp variables.
    return name?.reversed()?.toUpperCase()?:"Joker"

}
println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for William is ${nickName(null)}")

//using when
fun nickName2(name:String?):String = when(name) {
    "William" -> "Bill"
    null -> "Joker"
    else -> name.reversed().toUpperCase()
}

println("Nickname for William is ${nickName2("William")}")
println("Nickname for Venkat is ${nickName2("Venkat")}")
println("Nickname for William is ${nickName2(null)}")
