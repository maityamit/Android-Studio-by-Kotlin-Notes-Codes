fun main() {


  //for loop
  
  val names = arrayOf("amit","maity","linked")
  for(name in names){
    println(name)
  }

  for(i in names.indices){
    println(names[i])
  }

  for(i in 1..5){
    print(i)
  }

  if(4 !in 5..10){
    println("Not there")
  }

  //While Loop

  var i=0
  while(i<5){
    println("Hello")
    i++;
  }

  // do while Loop
  i=0
  do{
    println("Hi")
    i++;
  }while(i<5)
  
}

