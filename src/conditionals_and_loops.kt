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
}

fun loopTime(){

}