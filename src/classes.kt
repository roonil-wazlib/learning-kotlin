class ExampleClass(propertyOne: String, age: Int, var weight: Int){

    /*unlike python, variables declared here are instance-level, not class-level */
    val property = propertyOne
    //var weight is declared in the constructor list

    /* we can define set and get behaviour of attributes, but then we must
    also initalise them in init */

    var age = 0
        set(value) {
            if (value < 18) throw IllegalArgumentException("User must be an adult")
            field = value
        }

    lateinit var name: String //this is an attribute that i don't want to set on init

    /*all classes inherit from Any, so every class has the functions
    toString() (like __str__), equals(x), and hashCode().
     */

    init {
        /* this is like __init__ in Python. It is for more advanced
        complex initialisation logic. It is not needed for every class.
         */
        this.age = age
    }

    fun printStuff(){
        //'this' is the instance of the class (like self). It is implicitly passed to member functions

        println("My age is $age, and my property is $property")

        /* As long as there are no conflicts between attributes and local variable names,
        this.variable is redundant. Eg we can use age, instead of this.age.*/

        if (::name.isInitialized) println(name)
        //this is how we check if a lateinit is initialised.

    }

    infix fun join(thing: ExampleClass) {
        //defining our own infix member function
        println("${thing.property} infix $property")
    }

    operator fun plus(thing: ExampleClass) {
        //defining our own operation for +
        println("${thing.property} + $property")
    }

}

fun main(){
    val one = ExampleClass("one", 18, 50)
    val two = ExampleClass("two", 100, 10)

    one + two
    one join two

    one.printStuff()
}

