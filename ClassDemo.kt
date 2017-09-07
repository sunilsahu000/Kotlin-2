class Human(legs:String,hands:String,mouth:String){

    var legs:String? = ""
    var hands:String? = ""
    var mouth:String? = ""

    init {
        this.legs = legs
        this.hands = hands
        this.mouth = mouth
    }


    fun legs():Unit{
        println("I have $legs legs")
    }
    fun hands():Unit{
        println("I have $hands hands")
    }
    fun mouth():Unit{
        println("I have $mouth mouth")
    }
}




fun main(args: Array<String>) {
    var a = Human("two","two","single")
    a.legs()
    a.hands()
    a.mouth()
}