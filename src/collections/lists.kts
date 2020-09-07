
// listOf means immutable list
val fruits: List<String> = listOf("Apple","Banana","Grape")
println(fruits)
//要素のアクセスはIndexでもgetでもできるがIndexで良さそう
println("first's ${fruits[0]}, that's ${fruits.get(0)}")

//要素の確認はcontainまたはinを使う
println(fruits.contains("Apple")) //true
println("Apple" in fruits) //true

//immutableなので追加はできない
//fruits.add("Orange") //Error
//別のInstanceを作ってそこに追加することで対応が可能
val fruits2 = fruits + "Orange"
println(fruits2)

val noBanana = fruits - "Banana"
println(noBanana)
// mutableListOf is mutable list
// addで追加が可能
val mutableFruits: MutableList<String> = mutableListOf("Apple","Banana","Grape")
println(mutableFruits)
mutableFruits.add("Orange")
println(mutableFruits)
println(mutableFruits.remove("Apple"))
println(mutableFruits)