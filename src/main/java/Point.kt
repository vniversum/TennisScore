class Point(var value: Int = 0) {

    operator fun inc(): Point {
        return when (this.value) {
            0 -> Point(15)
            15 -> Point(30)
            30 -> Point(40)
            40 -> Point(0)
            else -> Point(0)
        }
    }
}

