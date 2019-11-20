fun main(){
    /* arrays are of fixed length, although they are mutable.
        Therefore, usually lists are used.
     */

    val strings = listOf("Alice", "Bob", "Eve")
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val set = setOf("foo", "bar", "baz")

    /*collections are both fixed length and immutable unless declared otherwise.
    Declaring mutable collections is done like this:
     */

    val stringsAgain = mutableListOf("Alice", "Bob", "Eve")

    println(stringsAgain.size) //.size for collections except for strings, which are .length

    /* if declaring empty collections, the type must be specified */

    val noInts: List<Int> = mutableListOf() //this was an example in documentation but what does it do?
    val noStrings = listOf<String>()
    val emptyMap = mapOf<String, Int>()

    val noInts2 = mutableListOf<Int>()

    println(noInts)
    noInts2.add(1)
    println(noInts2)

    //update - can't manage to use .add on noInts - still can't work out purpose of that line :(s

}