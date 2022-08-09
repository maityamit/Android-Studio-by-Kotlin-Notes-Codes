fun main() {

  var value: Int = addNumbers(5,4)
  println(value)

  printUserName("Amit","Maity")
  printUserName("Amit")
   
}

fun addNumbers(x: Int , y: Int): Int {
  return x+y
}

//Default Value
fun printUserName(firstName: String, lastName :String = "Doe"){
  println("$firstName $lastName")
}


fun addNumbers2(x:Int,y:Int)= x+y

