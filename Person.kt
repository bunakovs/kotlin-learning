data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>){
    val persons = listOf(Person("Alice", 27), Person("Bob", 55), Person("Jim", 87), Person("Kate"))
    val oldest = persons.maxBy{it.age ?: 0}
    println("The oldest is $oldest")
}