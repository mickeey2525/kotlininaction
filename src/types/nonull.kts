fun nickName(name:String): String?{
    if (name == "William") {
        return "Bill"
    }
    return null
    //return ""
}
println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
//println("Nickname for William is ${nickName(null)}")

//nullを返す可能性があるtypeには?のsuffixをつける