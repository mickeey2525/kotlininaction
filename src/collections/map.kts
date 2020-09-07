val sites = mapOf("pragprog" to "https://www.pragprog.com",
"agiledeveloper" to "https://agiledeveloper.com")
println(sites)
println(sites.size)
println(sites.containsKey("agiledeveloper"))
println(sites.containsValue("https://example.com"))
println("agiledeveloper" in sites)

// This does not work to access the value of a map
// val pragProgSite: String = sites.get("pragprog")
val pragProgSite:String? = sites.get("pragprog")
val pragProgSite2: String? = sites["pragprog"]
println(pragProgSite)
println(pragProgSite2)
//Keyが存在しないときのデフォルト値をgetOrDefaultで設定できる
val agiledeveloper = sites.getOrDefault("agiledeveloper","http://example.com")
println(agiledeveloper)

val sitesWithExample = sites + ("example" to "http://example.com")
val withoutAgileDeveloper = sites - "agiledeveloper"

for (entry in sites) {
    println("${entry.key} -- ${entry.value}")
}

for ((key,value) in sites) {
    println("$key --- $value")
}