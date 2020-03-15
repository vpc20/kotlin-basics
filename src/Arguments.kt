fun main() {
    println(productOfMany(1, 2, 3, 4))
    println(productOfMany1(1, 2, 3, 4))
}

private fun productOfMany(vararg numbers: Int): Int {
    var prod = 1
    numbers.forEach { prod *= it }
    return prod
}

private fun productOfMany1(vararg numbers: Int) = numbers.reduce { x, y -> x * y }
