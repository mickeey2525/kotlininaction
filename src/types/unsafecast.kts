import java.lang.StringBuilder

fun fetchMessage(id: Int):Any = if(id ==1) "Record found"
                                else StringBuilder("data not found")

/*
Message length: 12
java.lang.ClassCastException: class java.lang.StringBuilder cannot be cast to class java.lang.String (java.lang.StringBuilder and java.lang.String are in module java.base of loader 'bootstrap')
	at Unsafecast.<init>(unsafecast.kts:6)

for (id in 1..2) {
    println("Message length: ${(fetchMessage(id)as String).length}")
}
*/

for (id in 1..2) {
    println("Message length: ${(fetchMessage(id)as? String)?.length?:"---"}")
}
