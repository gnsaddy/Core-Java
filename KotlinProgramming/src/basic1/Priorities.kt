package basic1

fun main(args: Array<String>){

    // before variable
    var x=10
    var y=20
    var z=x+y
    println("z= $z")
  //  var a= ++x + y // firstly the variable is increased by 1 the add
   // var b= --x +y // firstly the variable is decreased by 1 then add
    //println( " b= $b ")

    // after variable
     var c= x++ +y
    println("c= $c")
    println(x)
    var d = x-- +y
    println("d= $d")

}