fun main(args:Array<String>) {
    var tot:Double = 0.0;
    println("Enter total subjects:")
    var num:Int = readLine()!!.toInt()
    var act=num;
    while(num-- > 0) {
        print("Enter subject marks.....")
        var mark = readLine()!!.toDouble()
        tot = tot + mark
    }
    println(tot);
        var per:Double?
                per= tot/act;
    println(per)
        when(per) {
            in 90..80 -> println("Excellent....")
            in 80..90 -> println("Very Good....")
            in 70..80 -> println("Good....")
            in 60..70 -> println("Better....")
            in 40..60 -> println("Need to improve....")
            else -> println("Sorry failed....")
        }
}