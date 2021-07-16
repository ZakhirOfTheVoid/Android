class UUIDGenerator():String{
    val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    var randomString: String = List(36) { charPool.random() }.joinToString("")
    var i:Int=0
    while (i<36){
        if (i==8 || i==13 || i==18 || i==23 ) randomString[i]="-"
        i++
        println("${randomString[i]}")
    }
}
