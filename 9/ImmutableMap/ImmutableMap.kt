
fun main(args:Array<String>){
    val langMap:Map<Int,String> = mapOf(1 to "A", 2 to "B", 3 to "C")
    for ((key,value) in langMap){
        println("key: $key, value: $value")
    }
}