fun main(args:Array<String>){
    var flag:Boolean = true
    loop1@
      for(i in 1..5) {
          loop2@
          for (j in 1..5) {

              if (i == 2 && j == 2) {
                  break@loop1
              }
              println("$i,$j")
          }
      }
}