fun main(args:Array<String>){
    var numbers : List<Int> = listOf(1,2,3,4,5)
    var names : List<String> = listOf("one","two","three")
    val fruits = listOf("apple","banana","kiwi")
    for (i in fruits.indices){
        println(fruits[i])
    }
    println(fruits[0])

    for (name in names){
        println(name)
    }
    for (number in numbers){
        print(number)
    }

    var idx = 0
    while (idx < fruits.size){
        println(fruits[idx])
        idx++
    }
}