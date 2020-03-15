fun main() {
    val words = listOf("a", "abc", "ab", "def", "abcd")
    val byLength = words.groupBy { it.length }

    println(byLength)
    println(byLength.keys) // [1, 3, 2, 4]
    println(byLength.values) // [[a], [abc, def], [ab], [abcd]]

    val mutableByLength: MutableMap<Int, MutableList<String>> = words.groupByTo(mutableMapOf()) { it.length }
// same content as in byLength map, but the map is mutable
    println("mutableByLength == byLength is ${mutableByLength == byLength}") // true


    val nameToTeam = listOf("Alice" to "Marketing", "Bob" to "Sales", "Carol" to "Marketing")
    val namesByTeam = nameToTeam.groupBy({ it.second }, { it.first })
    println(namesByTeam) // {Marketing=[Alice, Carol], Sales=[Bob]}

    val mutableNamesByTeam = nameToTeam.groupByTo(HashMap(), { it.second }, { it.first })
    // same content as in namesByTeam map, but the map is mutable
    println("mutableNamesByTeam == namesByTeam is ${mutableNamesByTeam == namesByTeam}") // true
}