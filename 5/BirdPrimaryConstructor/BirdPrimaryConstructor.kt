class Bird(var name:String, var wing:Int, var beak:String, var color:String){
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}
fun main(args:Array<String>){
    var coco = Bird("mybird",2,"short","blue")
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}