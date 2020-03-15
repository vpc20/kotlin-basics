fun main() {

    println(intArrayOf(1, 2, 3).toList().rotate(0))
    println(intArrayOf(1, 2, 3).toList().rotate(1))
    println(intArrayOf(1, 2, 3).toList().rotate(-1))
    println(arrayOf(1, 'a', 'b', 'c').toList().rotate(-1))

    val typedArr1 = intArrayOf(1, 2, 3).toList().rotate(-1).toTypedArray()
    println(typedArr1.contentToString())

}

fun List<Any>.rotate(n: Int): List<Any> {
    val listSize = this.size
    var r = n % listSize
    if (r == 0)
        return this
    if (r < 0)   // negative values means rotate left
        r += listSize
    return (this.subList(listSize - r, listSize) + this.subList(0, listSize - r))
}




