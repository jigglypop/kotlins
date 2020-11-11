class Bird(var name:String, var wing:Int, var beak:String, var color:String){
    init{
        println("--------초기화--------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("--------종료중--------")
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}
fun main(args:Array<String>){
    var coco = Bird("mybird",2,"short","blue")
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}