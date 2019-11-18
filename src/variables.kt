const val x = 3 //constant value

fun main(){
    println("Hello world!")

    //all variables are declared within scope
    var number = 10 //mutable variable
    val value = 1 //immutable value
    val namesUseLowerCamelCase = "abc"

    /*four primitive data types: long, int, short, byte
    long and int declared by initial size of variable (default int).
    short or byte declared with .toShort() etc.
     */
    var short = 15.toShort()
    var byte = 4.toByte()

    /* integer division is like python 2 - defaults to int output.
    use .toDouble() (16-17sf) or .toFloat() (6-7sf) to specify float
    on divisor.
     */
    println(10/3)
    println(10/3.toDouble())

    // string interpolation with $
    println("Number: $number")
    println("Expression: ${number - value}")

}