fun main() {

    val list1 = listOf(1, 2, 3, 1, 2, 3)

//    println(list1.get(0)) // 1
    println(list1[0]) // 1
    println(list1.indexOf(3)) // 2
    println(list1.lastIndexOf(2)) // 4
    println(list1.last()) // 3
    println(list1.last { it % 2 == 0 }) // 2
    println(list1.lastIndex) // 5
    println(list1.subList(1, 5)) // [2, 3, 1, 2]
    println(list1.contains(3)) // true
    println(list1.containsAll(listOf(2, 3, 4))) // false
    println(list1.size) // 6
//    println(list1.equals(listOf(1, 2, 3))) // false
    println(list1 == listOf(1, 2, 3)) // false
    println(list1.reversed())
    println(list1.asReversed())
    println(list1.all { it < 4 }) // true
    println(list1.any { it == 0 }) // false

//    println(list1.binarySearch {  })

//    println(list1.listIterator())
}