fun main() {

    val s1 = "aeiou"
    val s2 = "AEIOU"

    println("The length of '$s1' is ${s1.length}")
    val dashes = "-".repeat(5)

    // head
    println("Head".padStart(9, '-').padEnd(14, '-'))
    println(s1[0])
//    println(s1.get(0))
    println(s1.first())
    println(s1.take(1))
    println(s1.takeWhile { s1.indexOf(it) == 0 })
    println(s1.filterIndexed { i, _ -> i == 0 })

    // tail
    println("$dashes Tail $dashes")
    println(s1.substring(1, s1.length))
    println(s1.slice(1..s1.lastIndex))
    println(s1.drop(1))
    println(s1.dropWhile { s1.indexOf(it) == 0 })
    println(s1.filterIndexed { i, _ -> i > 0 })

    // initial
    println("$dashes Initial $dashes")
    println(s1.substring(0, s1.lastIndex))
//    println(s1.slice(0..s1.lastIndex - 1))
    println(s1.slice(0 until s1.lastIndex))
    println(s1.take(s1.lastIndex))
    println(s1.takeWhile { s1.indexOf(it) < s1.lastIndex })
    println(s1.dropLast(1))
    println(s1.dropLastWhile { s1.indexOf(it) > s1.lastIndex - 1 })
    println(s1.filterIndexed { i, _ -> i < s1.lastIndex })

    // last
    println("$dashes Last $dashes")
    println(s1[s1.lastIndex])
//    println(s1.get(s1.lastIndex))
    println(s1.takeLast(1))
    println(s1.last())
    println(s1.filterIndexed { i, _ -> i == s1.lastIndex })

    println("-".repeat(32))
    println("Capitalize $s1 --> ${s1.capitalize()}")
    println("Decapitalize $s2 --> ${s2.decapitalize()}")

    println("toUpperCase $s1 --> ${s1.toUpperCase()}")
    println("toLowerCase $s2 --> ${s2.toLowerCase()}")


    val filename = "sample.txt"
    println("$filename endsWith txt --> ${filename.endsWith("txt")}")
    println("$filename startsWith sam --> ${filename.startsWith("sam")}")

    val list1 = filename.split(".")
    println("Split filename - name = ${list1[0]}, ext = ${list1[1]}")

    println("Join filename - ${list1.joinToString(".")}")

    val s3 = "the quick brown fox"
    println("Filter vowels from '$s3' - ${s3.filter { "aeiou".contains(it) }}")
    println("Filter consonants from '$s3' - ${s3.filterNot { "aeiou".contains(it) }}")

    val s4 = "((text in parenthesis))"
    println(s4.trimStart('(').trimEnd(')'))
    println(s4.removeSurrounding("(", ")"))
    println(s4.removePrefix("(").removeSuffix(")"))
    println(s4.removeRange(6..8))
    println(s4.removeRange(6, 9))

    val s5 = "one, two, three, four, five"
    println(s5.replace(",", " and"))
    println(s5.replaceFirst(",", " and"))
    println(s5.replaceAfter(",", " two to five"))
    println(s5.replaceAfterLast(",", " 5"))
    println(s5.replaceBefore(",", "1"))
    println(s5.replaceBeforeLast(",", "one to four"))

    println(s5.indexOf("four"))
    println(s5.indexOfAny(listOf("three", "five")))
    println(s5.indexOfFirst { it == ',' })
    println(s5.indexOfLast { it == ',' })

    println(s5.find { it == ',' })
    println(s5.findLast { it == ',' })
    println(s5.findAnyOf(listOf("three", "five")))
    println(s5.findLastAnyOf(listOf("three", "five")))
    println(s5.substring(0, 3))

}