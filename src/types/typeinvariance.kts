/*
After this change, the Kotlin compiler doesn’t complain.
That seems unfair—the language seems to restrict Arrays but not List.
. But the reason for this difference in behavior is a good one.
 Array<T> is mutable, but List<T> is immutable.
 You may add an Orange to Array<Fruit>, but you can’t add anything to List<Fruit>.
 */

open class Fruit
class Banana: Fruit()
class Orange: Fruit()

fun receiveFruits(fruits: List<Fruit>) {
    println("Number of fruits: ${fruits.size}")
}

val bananas: List<Banana> = listOf()
