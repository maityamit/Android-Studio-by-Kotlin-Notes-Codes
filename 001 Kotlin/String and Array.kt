fun main() {

  var name: String = "Amit "+"Maity"

  var address: String = "House No "+23

  println(name)
  println(address)


  //IntArray
  val numbers = arrayOf(1,2,3,4)
  println(numbers.get(1))

  println(numbers.joinToString(","))

  val numbersZero = Array(4){0}
  println(numbersZero.joinToString(","))
  
   
}

