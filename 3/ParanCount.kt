fun main(args: Array<String>) {
    noParam { "Hello World" }
    oneParam {a-> "Hello World! $a"}
    oneParam { "Hello World! $it" }
    twoParam { a,b->"Hello World! $a $b" }
    twoParam { _,b->"Hello World! $b" }

}
fun noParam(out:()->String) = println(out());
fun oneParam(out:(String)->String){
    println(out("OneParam"))
}
fun twoParam(out :(String, String)->String){
    println(out("OneParam","TwoParam"))
}