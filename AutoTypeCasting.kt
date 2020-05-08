interface Expression
class Number (val v: Int) : Expression
class Mult (val v1: Expression, val v2: Expression) : Expression

fun eq(e: Expression): Int =
    when(e){
        is Number -> e.v
        is Mult ->{
            val e1 = eq(e.v1)
            val e2 = eq(e.v2)
            println("$e1 * $e2")
            e1 * e2
        } 
        else -> throw Exception("Unknow expression")
    }

    // if(e is Number){
    //     e.v
    // }
    // else if(e is Mult){
    //     val e1 = eq(e.v1)
    //     val e2 = eq(e.v2)
    //     println("$e1 * $e2")
    //     e1 * e2
    // }
    // else{
    //     throw Exception("Unknown expression")
    // }

fun main(args: Array<String>){
    println(eq(Mult(Mult(Number(2), Number(2)),Number(2))))
}