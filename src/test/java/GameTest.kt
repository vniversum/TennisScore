import kotlin.test.assertEquals
import org.junit.Test as test

class GameTest {

    @test
    fun incrementPoint1() {
        var game = Game()
        game++
        assertEquals(1, game.value)
    }

    @test
    fun incrementPoint2() {
        var game = Game(3)
        game++
        assertEquals(4, game.value)
    }
}