class Game(var value: Int = 0) {
    operator fun inc(): Game {
        return Game(++value)
    }


}