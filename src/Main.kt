fun main() {
    val cF: Figure = Circle(0, 4F)
    val cT: Transforming = Circle(0, 4F)
    cT.resize(5)
    cT.rotate(RotateDirection.CounterClockwise, 0, 3)
    println("Площадь круга: ${cF.area()}\n")

    val rF: Figure = Rect(1, 0, 0, 5, 2)
    val rT: Transforming = Rect(1, 0, 0, 5, 2)
    val rM: Movable = Rect(1, 0, 0, 5, 2)
    rT.resize(2)
    rT.rotate(RotateDirection.Clockwise, 1, 2)
    rM.move(-1, 5)
    println("Площадь прямоугольника: ${rF.area()}\n")

    val sF: Figure = Square(2, 1, 1, 3)
    val sT: Transforming = Square(2, 1, 1, 3)
    val sM: Movable= Square(2, 1, 1, 3)
    sT.resize(3)
    sT.rotate(RotateDirection.Clockwise, -1, 3)
    sM.move(2, 2)
    println("Площадь квадрата: ${sF.area()}\n")

}
