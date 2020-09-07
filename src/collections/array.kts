val friends = arrayOf("TinTin","Snowy","Haddock","Calculus")

println(friends::class)
println(friends::javaClass)
for (i in friends.iterator()) {
    println("$i")
}
println(Array(5) { i -> (i + 1) * (i + 1) }.sum()) //55