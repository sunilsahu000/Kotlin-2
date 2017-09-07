/*fun main(args: Array<String>) {
    var list = ArrayList<String>();
    list.add("Krishna");
    list.add("Krishna");
    list.add("Krisha");
    list.add("Krishnan");
    list.add("Aryan");
    list.add("Harman");
    println("List"+list);
    for (i in 0..list.size-1) {
        println("test")
        var a1:String = list.get(i);
        var a2:String = list.get(i-1);
        if (a1==a2) {
            list.remove(a1);
        }
    }
    println("List after short"+list);
}*/

fun main(args:Array<String>){
    var list = ArrayList<String>();
    println("Enter size of elements:")
    var n:Int = readLine()!!.toInt();
    for(item in 0..n-1) {
        println("Enter name:")
        var read:String = readLine()!!
        list.add(read);
        /*list.add("Krishna");
        list.add("Krishna");
        list.add("Kishan");
        list.add("Krishn");
        list.add("Aryan");
        list.add("Harm");*/
    }
    var hs=HashSet<String>(list);
    println("Before");
    println(list);
    println("After");
    println(hs);
}