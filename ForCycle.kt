import java.util.*

fun main(args: Array<String>){
    //range
    for(i in 0..10){
        if(i < 10) print("$i, ") else print("$i\n")
    }
    //range with step
    for(i in 10 downTo 0 step 2){
        if(i != 0) print("$i, ") else print("$i\n")
    }

    //until size and withIndex()
    val ar = listOf("11", "12", "13", "14")
    for(i in 0 until ar.size){
        if(i < ar.size-1) print("${ar[i]}, ") else print("${ar[i]}\n")
    }
    for((index, element) in ar.withIndex()){
        println("$index: $element")
    }
    
    //list iteration
    val tr = TreeMap<Int, String>()
    for(i in 0..256 step 32){
        tr[i] = Integer.toBinaryString(i)
    }
    for((num, bin) in tr){
        println("$num = $bin")
    }

}
