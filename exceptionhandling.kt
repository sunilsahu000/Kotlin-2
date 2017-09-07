import java.io.FileReader
import java.io.FileWriter

fun WriteToFile(str:String){
    try{
        val fo = FileWriter("test.txt",true)
        fo.write(str+"\n")
        fo.close()
        println("Data is saved")
    }
    catch(ex:Exception){
        println(ex.message)
    }
}

fun ReadFromFile(){
    try{
        val fin = FileReader("test.txt")
        var c:Int?
        do{
            c=fin.read()
            println(c.toChar())
        }while(c!= -1)
    }
    catch(ex:Exception){
        println(ex.message)
    }
}

fun main(args: Array<String>) {
    WriteToFile("Hello all this is sample text file to test exceptions.....")
    ReadFromFile()
}