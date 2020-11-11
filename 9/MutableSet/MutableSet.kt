
fun main(args:Array<String>){
    val animals = mutableSetOf("A","B","C","D","E")
    println(animals)
    animals.add("E")
    animals.add("F")
    println(animals)
    animals.remove("A")
    println(animals)
}