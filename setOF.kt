fun main(args:Array<String>){
    var set = setOf<Int>(3,4,5,6,7,88,88,88,88,40,40,40)
    var mute = mutableSetOf<String>("Ram","Ram","Rahim","Rahim","Raman","Rohith")
    for(item in set){
        println(item)
    }
    for(item in mute){
        println(item)
    }
    mute.add("Kalyan")
    mute.add("Trivikram")
    for(item in mute){
        println(item)
    }
}