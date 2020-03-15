import java.util.*

fun main() {
    println(createList(1, 2, 3, true, "asdf"))
    println(createList1(1, 2, 3,true, "asdf"))
    println(createList1(1, 2, 3))
}

fun <T> createList(vararg elems: T): List<T> {
    val newList = ArrayList<T>()
    for (elem in elems)
        newList.add(elem)
    return newList
}

fun createList1(vararg elems: Any): List<Any> {
    val newList = ArrayList<Any>()
    for (elem in elems)
        newList.add(elem)
    return newList
}