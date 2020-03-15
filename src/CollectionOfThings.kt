fun main() {
    printClasses(setOf(1, 2, 3))
    println("")
    printClasses(listOf('a', 'b', 'c'))
    println("")
//    printClasses(arrayListOf('a', 'b', 'c'))
//    println("")
    printClasses(mapOf("k1" to "v1", "k2" to "v2", "k3" to "v3"))
    println("")
    printClasses(intArrayOf(1, 2, 3))
    println("")
    printClasses(arrayOf("item1", "item2", "item3", 999))
    println("")

    val array1 = Array(5) { it }
    array1.forEach{print("$it ")}
    println("")

    val list2 = array1.toMutableList()
    println(list2.slice(0..2))

    val ml1 = mutableListOf<String>()
    ml1.add("asdfasdf")
    println(ml1)
}


private fun printClasses(obj: Any) {
    var objClass: Class<in Any>? = obj.javaClass
    while (objClass != null) {
        println(objClass)
        objClass = objClass.superclass
    }
}