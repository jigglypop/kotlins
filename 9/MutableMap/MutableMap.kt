
fun main(args:Array<String>){
    val map:MutableMap<Int,String> = mutableMapOf(1 to "A", 2 to "B", 3 to "C")
    println(map.values)
    println(map.keys)
    map.put(4, "D")
    map.remove(1)
    println(map)
    val map2:MutableMap<Int,String> = mutableMapOf(5 to "E", 6 to "F")
    map.putAll(map2)
    println(map)
}