fun main(args:Array<String>){
    print("Enter a number:")
    var a:Int = readLine()!!.toInt();
    print("Enter a number:")
    var b:Int = readLine()!!.toInt();
    var get:String?
    do {
        println("Do you want to perform an operation:(Y)")

        //var get:String = readLine()!!
        get = readLine()!!
        if(get=="Y") {
            print("Enter a operator:" + "\n" + " Either +,-,*,/,% :")
            var operator = readLine()
            var res = when (operator) {
                "+" -> a + b
                "-" -> a - b
                "*" -> a * b
                "/" -> a / b
                "%" -> a % b
                else ->
                    println("Enter Valid Operator....")
            }
            println(res);
            println("Enter $ to quit");
        }
    }while(get!="$")
}