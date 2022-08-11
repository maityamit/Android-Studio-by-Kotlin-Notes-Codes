fun main() {


  var x=567
  println(reverse(x))
  
}

fun reverse(x: Int):Int{
  var rev = 0
  var temp=x
  while(temp!=0){
    rev=(rev*10)+temp%10
    temp/=10
  }
  return rev
}

