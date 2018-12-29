package basic1

fun main(args: Array<String>) {
    var myNum=100  // myNum is the name of variable and 100 is the data type
                    // that means var varName = data_type or value
    var myString="Aditya raj"   // string is mutable in nature
    var myDecimal=123.1122
    println(myNum )
    println(myString)
    println(myDecimal)

    // if we want to initialize ony variable name
    var mySecondString:String
    mySecondString="decleration of string"
    println(mySecondString)

    // for declaring constant value of any variable we need the keyword (val) that means this value cannot be changed throughout the program

    val myConstVar="constant string value"
    println(myConstVar)
    val myConstNum=200
    println(myConstNum)
    // myConstNum=230  error value cannot be reassigned

    var check:String?
    check= null
    println(check)

}