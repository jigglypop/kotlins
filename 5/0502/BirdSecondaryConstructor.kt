class Bird{
    var name:String
    var wing:Int
    var beak:String
    var color:String
    constructor(name:String, wing:Int, beak:String, color:String){
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }
    constructor(name:String, wing:Int){
        this.name = name
        this.wing = wing
        this.beak = "beakbeak"
        this.color = "black"
    }
    fun fly() = println("Fly wing: $wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}
fun main(args:Array<String>){
    var coco = Bird("mybird",2,"short", "blue")
    coco.color = "yello"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
    var haha = Bird("mybird",2)
    println("haha.beak : ${haha.beak}")
    println("haha.color : ${haha.color}")
}