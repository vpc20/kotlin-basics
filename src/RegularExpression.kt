fun main() {

    val set1 = setOf(1, 2, 3, 4, 5)
    val set2 = setOf(1, 2, 3)
    if (set1.containsAll(set2))
        println("true")

    if (set2.isSubsetOf(set1))
        println("is subset true")
//    val list1 = listOf(1, 2, 3, 4, 5, 'a')
//    val list2 = listOf(1, 2, 3)
//    if (list2 in list1)

    println("ab*".toRegex().matches("ab"))
    println("ab*".toRegex().matches("abb"))
    println("[A-za-z][A-za-z0-9]*".toRegex().matches("0abb1S"))
    println("www\\.[a-z]+\\.com".toRegex().matches("www.x.com"))

    println("------------------------------")
    println("a".toRegex().matches("a"))
    println("a*".toRegex().matches(""))
    println("a*".toRegex().matches("a"))
    println("a*".toRegex().matches("aa"))
    println("a*".toRegex().matches("aaa"))

    println("a+".toRegex().matches(""))
    println("a+".toRegex().matches("a"))
    println("a+".toRegex().matches("aa"))
    println("a+".toRegex().matches("aaa"))

    val numberRegex = "\\d+".toRegex()
    val numbers1 = listOf("abc", "123", "456").filter(numberRegex::matches)
    println(numbers1)

    // numbers
    println(listOf("abc", "123", "456", "@#$").filter { "\\d+".toRegex().matches(it) })
    // alphanumeric
    println(listOf("abc", "123", "456", "@#$").filter { "\\w+".toRegex().matches(it) })

    println("(\\d{4}-){3}\\d{4}".toRegex().matches("1234-1234-1234-1234"))
    println("""\d{4}-\d{4}-\d{4}-\d{4}""".toRegex().matches("1234-1234-1234-1234"))

    println("""Regex "\d" """)
    (0..127).filter { """\d""".toRegex().matches(it.toChar().toString()) }
            .map(Int::toChar)
            .forEach(::print)

    println("\nRegex \"\\w\"")
    (0..127).filter { "\\w".toRegex().matches(it.toChar().toString()) }
            .map(Int::toChar)
            .forEach(::print)

    println("\nRegex \"\\s\"")
    (0..127).filter { "\\s".toRegex().matches(it.toChar().toString()) }
            .map { it.toChar().toInt() }
            .forEach { print("$it ") }

    println("\nAll chars")
    (0..127).forEach { print(it.toChar()) }

    println("")
    println("Hello \nworld")
    println("""Hello \nworld""")

    val x = "a*".toRegex().findAll("aaababaa")
    for (item in x)
        println(item.value)

    val y = "a*".toRegex().find("aaabbb")
    println(y?.value)

    val z = """(\d{4}-){3}\d{4}""".toRegex().pattern
    println(z)

}

fun <E> Set<E>.isSubsetOf(set1: Set<E>) = this.all { it in set1 }

