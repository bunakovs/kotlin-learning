fun main(args: Array<String>){
    val a = 5
    val b = 7
    println("Result of maxBody: ${maxBody(a,b)}")
    println("Result of maxExp: ${maxExp(a,b)}")
    println("Result of max: ${max(a,b)}")
}

//Block body function
fun maxBody(a: Int, b: Int): Int {
    return if(a > b) a else b
}

//Expression body function
fun maxExp(a: Int, b: Int): Int = if(a > b) a else b

// with type inference
fun max(a: Int, b: Int) = if(a > b) a else b