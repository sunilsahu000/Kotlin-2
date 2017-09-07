class PrintMyData<T>(n1:T)
{
    init {
        println(n1)
    }
    fun operate(n1:T,n2:T):Unit{
        println("$n1 and $n2")
    }
}

fun main(args: Array<String>) {
    var value1 = PrintMyData<String>("Rohith")
    var value2 = PrintMyData<Int>(13)
    value2.operate(4,40)
}