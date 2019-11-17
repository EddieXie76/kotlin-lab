fun main(args: Array<String>) {
    val person : Any = createPerson()
    println("${person}")
}

fun createPerson(): Any {
    var o =  object{
        var firstName = "Kotlin"
        var lastName  = "World"
    }
    return o
}