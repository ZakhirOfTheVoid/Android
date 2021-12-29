fun main(){
    val myArray1 = arrayOf(1, 2, 5, 9)
    val myArray2 = arrayOf(4, 5, 6 )
    val myArray3 = myArray1 + myArray2
    println("array consists of ${myArray3.asList()}")
    myArray3.sort()
    println("array consists of ${myArray3.asList()}")
}
