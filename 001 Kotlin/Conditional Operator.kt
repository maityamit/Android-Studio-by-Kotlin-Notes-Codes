fun main() {

  var discount = 0
  val price = 85
  if(price>50){
    discount=10
  }else{
    discount=5
  }
  println(discount)

  discount = if(price>50) 10 else 3
  println(discount)



  val rating = 4
  val result = when(rating){
    5-> "High"
    4-> "Medium"
    1,2,3-> "Low"
    else ->{
      "Zero"
    }
  }
  println(result)
  
  
}

