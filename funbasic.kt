fun sum(n1:Int,n2:Int):Unit{
    println(n1+n2)
}
fun sum(n1:Int,n2:Int,n3:Int):Int{
    return n1+n2+n3
}
fun sum(n1:Int,n2:Int,n3:Double):Unit{
    display(n1+n2+n3)
}

fun display(res:Double){
    println(res)
}
fun main(args: Array<String>) {
    sum(20,30)
    var res:Int = sum(20,30,40)
    println(res)
    sum(12,13,55.55)
}