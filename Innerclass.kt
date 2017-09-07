class Outter{
     fun ShowMyTextOutter(n1:String){
         println("I am outer.... $n1")
     }
    inner class Nested(){
        fun ShowMyText(n1:String){
            println("I am call from inner...... $n1")
        }
    }
}


fun main(args: Array<String>) {
    var out = Outter()
    out.ShowMyTextOutter("This is my outter class")
    var nested = Outter().Nested()
    nested.ShowMyText("This is inner test")

}