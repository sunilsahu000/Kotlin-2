import java.util.*

fun main(args:Array<String>){
    var year = Calendar.getInstance().get(Calendar.YEAR)
    println("Enter Birth Year:")
    var birthyear:Int = readLine()!!.toInt()
    var age = year - birthyear
    if(age >= 18){
        println("Enter name....")
        var name = readLine()
        println("$name you are eligible for perfrming dollar conversion")
        println("Enter amount in dollars")
        var dol:Double = readLine()!!.toDouble()
        var rup = dol * 67;
        println("Amount in rupees:$rup")
    }
    else
        println("Sorry.... You aren't eligible!!")

}