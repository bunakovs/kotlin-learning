class Rectangle(val height: Int, val width: Int){

    val isSquare: Boolean
        get() = height==width

    val area: Int
        get(){
            return height*width
        }

}

fun main(args: Array<String>){
    val r = Rectangle(10, 10)
    println("Rectangle:\n Heigth = ${r.height},\n Width = ${r.width},\n Square = ${r.isSquare},\n Area = ${r.area}")
}