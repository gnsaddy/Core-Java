package basic1
//inputting data from the user

fun main(args: Array<String>) {
    println("input the details:-")
    var name = readLine()
    var age: Int = readLine()!!.toInt()
    var city = "new delhi"
    println("name " + name + " age " + age + " city " + city)

    println("enter integer ")
    var a: Int = readLine()!!.toInt()
    var b: Int = readLine()!!.toInt()
    var c = a + b
    println("addition is " + c)
}
