fun main(args:Array<String>){
    var map = HashMap<Int,String>()
    map.put(0,"Mahesh")
    map.put(4,"Rohith")
    map.put(3,"Kalyan")
    map.put(2,"Trivikram")

    for(item in map.keys){
        println(map.get(item))
    }
}