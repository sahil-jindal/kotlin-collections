data class Person(
    val firstName: String,
    val lastName: String,
    val nationality: String,
    val age: Int
)

fun main() {
    val people = listOf(
        Person("Anil", "Deshpande", "Indian", 40),
        Person("Amit", "Behl", "Indian", 26),
        Person("George", "Orwel", "UK", 50),
        Person("Hazel", "Keech", "UK", 26),
        Person("Anees", "Khan", "Pakistan", 30),
        Person("James", "Blend", "UK", 15)
    )

//    people.groupBy { it.nationality }.forEach { println("${it.key} -> ${it.value}") }
//    val result = people.groupingBy { it.nationality }.eachCount()
//    println(result)

//    val groupByAge = people.groupingBy { it.age > 18 }.eachCount()
//    println(groupByAge)

    // Transformation
    val result = people.groupBy(keySelector = { if(it.age > 18) "Major" else "Minor"}, valueTransform = {it})
    println(result)

//    val groupByFirstName = people.groupingBy { it.firstName.get(0) }.eachCount()
//    println(groupByFirstName)
}