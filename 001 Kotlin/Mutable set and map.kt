fun main() {

  val names = mutableListOf("Amit","Maity")
  println(names)
  names.add("sara")
  println(names)
  names.removeAt(1)
  println(names)
  names.clear()
  println(names)


  val classRanks = mapOf(1 to "sarah",2 to "Mark")
  println(classRanks.keys)


  val classRank = mutableMapOf(1 to "sarah",2 to "Mark")
  println(classRank)
  classRank.put(3,"Asim")
  println(classRank)
  
  
}
