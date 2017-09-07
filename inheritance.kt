open class Operations(){
   fun sum(n1:Int,n2:Int):Int{
       return n1+n2
   }
    fun sum(n1:Int, n2:Int,n3:Int):Int{
        return n1+n2+n3
    }
}
class MultiOperations():Operations(){
    fun mult(n1:Int,n2:Int):Int{
        return n1*n2
    }
    fun div(n1:Int,n2:Int):Double{
        return (n1/n2.toDouble())
    }
}

fun main(args: Array<String>) {
    //var op = Operations()
    var mul = MultiOperations()
    var sum = mul.sum(10,20)
    var sum3 = mul.sum(10,20,30)
    var multiply = mul.mult(10,20)
    var div:Double = mul.div(10,20)
    println("Sum is $sum")
    println("Sum3 is $sum3")
    println("Multiply is $multiply")
    println("Division is $div")
}
