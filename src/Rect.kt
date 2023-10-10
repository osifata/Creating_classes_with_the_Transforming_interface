open class Rect(id: Int, var x: Int, var y: Int, val a: Int, val b: Int) : Figure(id), Transforming, Movable {
    override fun area(): Float = (a * b).toFloat()

    override fun resize(zoom: Int) {
        val newA = (a * zoom).toFloat()
        val newB = (b * zoom).toFloat()
        println("Увеличимаем фигуру в $zoom раза. Новые сторона а и б: ($newA, $newB).")
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val rotationDirection = if (direction == RotateDirection.Clockwise) "Clockwise" else "CounterClockwise"
        println("Вращаем прямоугольник $rotationDirection вокруг точки ($centerX, $centerY).")
    }

    override fun move(dx: Int, dy: Int) {
        x += dx
        y += dy
        println("Координаты после перемещения $x, $y")
    }
}