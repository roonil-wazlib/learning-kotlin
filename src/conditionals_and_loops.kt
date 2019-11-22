fun main(){
    //if else works same as java
    val x = 10
    if (x < 10){
        println("x is small")
    }
    else if (x == 10){
        println("x is 10")
    }
    else {
        println("x is small")
    }

    //ternary conditionals same as python
    var y = if (x < 10) 5 else 6

    whenStuff()
}

fun whenStuff(){
    //when is similar to switch in Java

    var x = 10

    when(x){
        1,2 -> println("x=$x")
        in 3..9 -> println("x is a bit bigger")
        10 -> println("10!")
        else -> println("x is big")
    }

    /* when cases can overlap, unlike java, in which case
        the first true case is run.
       We can also assign variables similarly to java:
     */

    var y = when(x){
        1,2 -> "x=$x"
        in 3..9 -> "x is a bit bigger"
        10 -> {
            println("WORKING")
            "10"
        }
        else -> "x is big"
    }

    println(y)

    //smart casting is also a thing
    when (x) {
        is Int -> println(x + 1)
        //etc
    }

    forLoops()
    whileLoops()
    continueAndBreak()
}

fun forLoops(){

    //looping through a collection
    val ls = listOf(1,2,3)
    for (item in ls) {
        println("Hello world")
    }

    //looping through a range of numbers:

    for (x in 0..10){ //inclusive
        println(x)
    }

    for (x in 0 until 10){ //exludes final number like range()
        println(x)
    }

    //changing the step and going downwards:
    for (x in 10 downTo 0 step 2){ //inclusive
        println(x)
    }

    //enumerate

    for((index, value) in ls.withIndex()){
        println("$index $value")
    }

    //equivalent of casting range to list:
    val numbers = (0..9).toList()
    println(numbers)
}

fun whileLoops(){

    //essentially the same as Python
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
}

fun continueAndBreak(){
    /*
    Same as python when used in the same way however
    we can also label which loop we want to continue to.
     */
    val primes = mutableListOf<Int>()
    outer@ for (x in 1..100){
        for (y in 2 until x){
            if (x%y == 0){
                continue@outer //not a prime so skips rest of inner for loop and continues back at outer
            }
        }
        primes.add(x)
    }
    println(primes)
}