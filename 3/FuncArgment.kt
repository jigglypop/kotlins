fun main(args: Array<String>) {
    var res4 = sum2(3, 2)
    var res5 = mul2(sum2(3, 3), 3)
    println("$res4, $res5")
}
fun mul2(a: Int, b: Int) = a * b
fun sum2(a: Int, b: Int) = a + b
