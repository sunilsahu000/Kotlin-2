import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader

class Singleton{
    constructor(){
        println("I am constructor..........")
    }
    var name:String? = null
    companion object {
        val instance:Singleton by lazy{ Singleton()}
    }
}

fun main(args:Array<String>){
    var sin1 = Singleton.instance
    sin1.name = "Pawan Kalyan"
    println("Object 1: "+sin1.name)
    var sin2 = Singleton.instance
    println("Object 2: "+sin2.name)
}