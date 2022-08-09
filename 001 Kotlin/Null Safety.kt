fun main() {

  // Null Safety
  var name: String = "Amit"
  //var nameNull:String = null
  // CanNot assign direct
  var string: String? = null
  
  println(name.length)
  // println(nameNull.length)


  //safe call operator
  println(string?.length)

  //Elvis Operator (?:)
  println(string?.length ?: 0)

  printNameLength("Amit","Maity")
  
}

fun printNameLength(firstName: String?, lastName: String?){
  if(firstName != null){
    println("name: ${firstName.length} ${lastName!!.length}")
  }
}
