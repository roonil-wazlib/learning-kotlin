fun main(){

    /* functions are very similar to python with just a couple of differences
    Parameter and return types have to be declared, as in Java, and functions can be overloaded
    as long as their paramaters differ.
     */

    val message = getGreeting("Emma")
    println(message)

    //overloading example
    val integer = 5
    val double = 1.5

    halve(integer)
    halve(double)

    //return Unit example
    println(countUp(10))
}

fun getGreeting(name: String, surname: String = "Smith") : String {
    return "Hello $name $surname"
}

fun halve(value: Int){
    println(value/2)
}

fun halve(value: Double){
    println(value/2.toDouble())
}

fun countUp(max: Int){
    for (i in 1..max){
        println(i)
    }
    /*by default, Unit is returned, not Null
    This indicates the function has no return at all, rather than it sometimes returning something
    and just not doing so in this case.
     */
}