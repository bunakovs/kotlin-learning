import Color.*

enum class Color(val r: Int, val g: Int, val b: Int){
    RED(255,0,0), GREEN(0,255,0), BLUE(0,0,255), ORANGE(255,165,0), YELLOW(255,255,0), INDIGO(75,0,130), VIOLET(238, 130, 238);

    fun getHex() = (if (r > 9) r.toString(16) else "0" + r.toString(16)) + 
                   (if (g > 9) g.toString(16) else "0" + g.toString(16)) + 
                   (if (b > 9) b.toString(16) else "0" + b.toString(16))

    fun getColorTemp() =
        when(this){
            RED, ORANGE, YELLOW -> "Warm"
            GREEN -> "Neutral"
            INDIGO, BLUE, VIOLET -> "Cold"
        }
    
}

fun mixColor(c1: Color, c2: Color) =
    when{
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        else -> throw Exception("Unknown color")
    }

fun main(args: Array<String>){
    val c = RED
    println(c.getHex())
    println(c.getColorTemp())
    println(mixColor(RED, YELLOW).getHex())
}