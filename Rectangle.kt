import java.util.Random

class Rectangle(val height: Int, val width: Int){

    val isSquare: Boolean
        get() = height==width

    val area: Int
        get(){
            return height*width
        }
    
    fun createRandom() = createRandomRectangle()

    fun print(){
        println("Rectangle:\n Heigth = $height,\n Width = $width,\n Square = $isSquare,\n Area = $area")
    }

}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(100), random.nextInt(100))
}

fun main(args: Array<String>){
    val rectangles = listOf(Rectangle(10, 10), Rectangle(2, 5), createRandomRectangle())
    for(rectangle in rectangles){
        rectangle.print()
    }
}