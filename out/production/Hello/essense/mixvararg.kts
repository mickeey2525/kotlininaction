fun greetMany(msg:String, vararg names:String){
    println("$msg, ${names.joinToString(",") }")
}

greetMany(msg="Hello","Tom","Jerry")