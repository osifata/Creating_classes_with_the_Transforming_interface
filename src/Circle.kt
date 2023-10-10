class Circle(id: Int, val radius: Float) : Figure(id), Transforming {
    override fun area(): Float = (Math.PI * radius * radius).toFloat()

    override fun resize(zoom: Int) {
        val newRadius = radius * zoom
        println("Увеличимаем фигуру в $zoom раза. Новый радиус: $newRadius.")
    }

    override fun rotate(direction: RotateDirection, centerX: Int, centerY: Int) {
        val rotationDirection = if (direction == RotateDirection.Clockwise) "Clockwise" else "CounterClockwise"
        println("Вращаем круг $rotationDirection вокруг точки ($centerX, $centerY).")
    }
}