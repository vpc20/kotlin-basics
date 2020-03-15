fun main() {

    val list1 = listOf(1, 2, 3, 4, 5)
    list1.forEach(::println)

    list1.forEach(fun(it: Int) = println(it))

//    list1.forEach({ println(it) })

//    list1.forEach({ it: Int -> println(it) })

    list1.forEach {
        println(it)
    }

    list1.forEach(printFunction())

    list1.forEach(printFunction1())

    list1.forEach(printFunction2)
}

private fun printFunction(): (Int) -> Unit {
    return {
        println(it)
    }
}

private fun printFunction1(): (Int) -> Unit = { println(it) }

val printFunction2 = { it: Int -> println(it) }
