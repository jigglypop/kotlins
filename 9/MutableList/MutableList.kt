
fun main(args:Array<String>){
    val mutableList: MutableList<String> = mutableListOf<String>("A","B","C")
    mutableList.add("D")
    mutableList.removeAt(1)
    mutableList[0] = "E"
    println(mutableList)

    val mutableListMixed = mutableListOf("A","B", 2, 3)
    println(mutableListMixed)
}