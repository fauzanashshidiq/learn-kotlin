//fun main() {
//    println("Hello, world!")
//}

//fun main() {
//    val popcorn = 5
//    val hotdog = 7
//    println(popcorn)
//    println(hotdog)
//    val customers = 10
//    println("There are $customers customers")
//    println("There are ${customers + 1} customers")
//}

//fun main() {
//    var d: Int
//    d = 3
//    val e: String = "hello"
//    d = d + 5
//    d += 7
//    d -= 3
//    d *= 2
//    d /= 3
//    println(d)
//    println(e)
//}

//fun sum(x: Int, y: Int): Int {
//    return x + y
//}
//fun main() {
//    println(sum(1, 2))
//}

//fun uppercaseString(text: String): String {
//    return text.uppercase()
//}
//fun main() {
//    println(uppercaseString("hello"))
//    // HELLO
//}

//fun main() {
//    val upperCaseString = { text: String ->
//        text.uppercase() }
//    println(upperCaseString("hello"))
//    // HELLO
//}

class Contact(val id: Int, var email: String)
fun main() {
    val contact = Contact(1, "mary@gmail.com")

    // Prints the value of the property: email
    println(contact.email)
    // mary@gmail.com
    // Updates the value of the property: email
    contact.email = "jane@gmail.com"

    // Prints the new value of the property: email
    println(contact.email)
    // jane@gmail.com
}