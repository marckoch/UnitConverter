package stage2

fun main() {
    println("Enter a number of kilometers: ")
    val kilometers = readLine()!!.toInt()
    println("$kilometers kilometers is ${1000 * kilometers} meters")
}