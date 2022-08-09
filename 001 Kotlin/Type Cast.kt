fun main() {

  val a: Int = 10
  val b: Long = a.toLong()
  println(b)

  val name: Any = "Amit"
  if(name is String){
    println(name.length)
  }
  
  
}

