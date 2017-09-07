fun main(args:Array<String>){
    println("Enter gifts by Reema...")
    var gr:Int = readLine()!!.toInt()
    println("Enter gifts by Seema...")
    var gs:Int = readLine()!!.toInt()
    var final = if(gr > gs) gr else gs
    println("Congratualations.... Now say what is your age?")
    var age:Int = readLine()!!.toInt()
    var reply:String?=when(age){
        in 18..22-> "Lets go for date"
        else-> "Sorry... I can't come"
    }
    print(reply)
}