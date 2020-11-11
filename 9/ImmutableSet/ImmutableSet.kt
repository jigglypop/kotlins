
fun main(args:Array<String>){
    val mixedTypesSet = setOf("Hello", 5, "world", 3.14, "C")
    var intSet: Set<Int> = setOf<Int>(1,3,3)
    println(mixedTypesSet)
    println(intSet)
}