fun main() {


  val x=2
  val n=5
  println(power(x,n))
  
}

fun power(x: Int,y: Int):Int{
  if(y==0) return 1
  return x*power(x,y-1)
}

