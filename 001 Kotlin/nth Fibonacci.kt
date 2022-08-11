fun main() {


  var x=5
  println(fibonacci(x))
  
}

fun fibonacci(x: Int):Int{
  if(x==0 || x==1) return 1;
  return fibonacci(x-1)+fibonacci(x-2)
}

