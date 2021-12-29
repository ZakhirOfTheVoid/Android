/*посложнее: объединить два массива целых чисел, сохранив упорядоченность
merge( {1, 2, 5, 9}, {4, 5, 6} ) -> {1, 2, 4, 5, 5, 6, 9}*/
fun main(){
    val myArray1 = arrayOf(1, 2, 5, 9)
    val myArray2 = arrayOf(4, 5, 6 )
    val myArray3 = myArray1 + myArray2
    println("array consists of ${myArray3.asList()}")
    myArray3.sort()
    println("array consists of ${myArray3.asList()}")
}
