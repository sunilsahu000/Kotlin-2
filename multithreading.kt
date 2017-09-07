import jdk.nashorn.internal.ir.ThrowNode

class MyTread():Thread(){
    var thname:String? = null
    constructor(thname:String):this(){
        this.thname = thname
    }

    override fun run() {
        for(item in 1..10){
            println("$thname is running $item")
            Thread.sleep(1000)
        }
    }
}

fun main(args: Array<String>) {
    var myThread1 = MyTread("PK")
    myThread1.start()
    var myThread2 = MyTread("VJ")
    myThread2.start()
    var myThread3 = MyTread("Che")
    myThread3.start()
}