data class Person(var name: String,
                  var age: Int ) {
    val isAdult: Boolean
        get() = age > 17

//    var stringRepresentation: String
//        get() = this.toString()
//        set(value) {
//            setDataFromString(value) // parses the string and assigns values to other properties
//        }

}

fun main() {
    val persons = listOf(
            Person("Alice", 22),
            Person("Bob", age = 49),
            Person("Charlie", age = 19))

    val oldest = persons.maxBy { it.age }
    println("The oldest is: $oldest")
    println(persons.filter { it.isAdult })

}