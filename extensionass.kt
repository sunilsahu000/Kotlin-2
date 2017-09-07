
fun ArrayList<Int>.even(n1:Int){
    //var str:String?
       if(n1%2==0)
        println("$n1 is even number")
        else
            println("$n1 is odd number")

}

fun ArrayList<Int>.prime(n1:Int){
    var flag = false
    for (i in 2..n1 / 2) {
        // condition for nonprime number
        if (n1 % i == 0) {
            flag = true
            break
        }
    }

    if (!flag)
        println("$n1 is a prime number.")
    else
        println("$n1 is not a prime number.")
}




fun main(args: Array<String>) {
    var arr = ArrayList<Int>()
    arr.add(1)
    arr.add(2)
    arr.add(3)
    arr.add(4)
    arr.even(4)
    arr.prime(2)
}