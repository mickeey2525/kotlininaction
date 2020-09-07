fun max(vararg numbers:Int): Int{
    var large = Int.MIN_VALUE

    for (number in numbers) {
        large = if (number > large) number else large
    }
    return  large
}

println(max(1,5,2))
println(max(1,5,2,12,7,3))

//Arrayを渡したい場合
val values = intArrayOf(1,21,3)
//引数の型と違うために渡せない
//println(max(values))
// Type mismatch: inferred type is IntArray but Int was expected
// このケースは"*"を使う。
println(max(*values))

//Listの場合は一度Arrayに変換する必要がある。
println(max(*listOf(1,2,3,4).toIntArray()))
