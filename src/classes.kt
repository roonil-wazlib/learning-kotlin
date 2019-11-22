class ExampleClass(propertyOne: String, var age: Int){
    /*unlike python, variables declared here are instance-level, not class-level */
    val property = propertyOne
    //var age is declared in the constructor list


    /*all classes inherit from Any, so every class has the functions
    toString() (like __str__), equals(x), and hashCode().
     */


}