fun ArrayList<String>.swap(n1:Int,n2:Int){
    var temp = this.get(n1)
    this.set(n1,this.get(n2))
    this.set(n2,temp)
}

fun ArrayList<String>.appendAll(n1:String){
    for(item in 0..size-1){
        var valu = this.get(item)
        this.set(item, valu+"--God")
    }
}

fun main(args: Array<String>) {
    var arrNames = ArrayList<String>()
    arrNames.add("Rohith")
    arrNames.add("Kalyan")
    arrNames.add("Trivikram")
    println("**Before Swap**")
    for(item in arrNames){
        println(item)
    }
    arrNames.swap(1,2)
    println("**After Swapping**")
    for(item in arrNames){
        println(item)
    }

    println("**Before Append**")
    for(item in arrNames){
        println(item)
    }
    arrNames.appendAll("--God")
    println("**After Append**")
    for(item in arrNames){
        println(item)
    }
}