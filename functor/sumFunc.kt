// sum 함수 1
// fun sum(a: Int, b: Int): Int {
//     return a + b
// }

// sum 함수 2
fun sum(a: Int, b: Int) = a + b

// 반환값이 없는 함수 : Unit
fun printSum(a: Int, b: Int): Unit {
    println(a + b)
}

fun main() {
    var result = sum(1, 2)
    println(result)
    printSum(3, 4)
}

