class Calc{
    fun add(x:Int, y:Int):Int = x+y
    fun add(x:Double, y:Double):Double = x+y
    fun add(x:Int, y:Int,z:Int):Int = x+y+z
}

fun main(args:Array<String>){
    val calc =Calc()
    println(calc.add(3,2))
    println(calc.add(3.2,1.2))
    println(calc.add(3,3,2))
}