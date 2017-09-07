class Biryani(){

    var type:String? =null
    var cost:Double? = 0.0
    var meat:String? = null
//    init {
//        println("This is default constructor...")
//    }
    constructor(type:String,cost:Double,meat:String):this(){
       this.type = type
       this.cost = cost
       this.meat = meat
       println("You have ordered $meat $type $str of cost $cost/-")
    }
    constructor(hotel:String):this(){
        var hotl = hotel
        println("Hotel name: $hotel")
    }
    companion object {
         var str = "Biryani"
    }
}



fun main(args: Array<String>) {
         var test = Biryani("Bawarchi")
         var bd = Biryani("Dum",150.35,"Mutton")
         var cd = Biryani("Dum",140.35,"Chicken")
         var test2 = Biryani("Paradise")
         var bf = Biryani("Fry",140.35,"Mutton")
         var cf = Biryani("Fry",130.35,"Chicken")
}