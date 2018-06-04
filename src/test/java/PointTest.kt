import kotlin.test.assertEquals
import org.junit.Test as test

class PointTest {

    @test
    fun incrementPoint1() {
        var point = Point()
        point++
        assertEquals(15, point.value)
    }

    @test
    fun incrementPoint2() {
        var point = Point(15)
        point++
        assertEquals(30, point.value)
    }

    @test
    fun incrementPoint3() {
        var point = Point(30)
        point++
        assertEquals(40, point.value)
    }

    @test
    fun incrementPoint4() {
        var point = Point(40)
        point++
        assertEquals(0, point.value)
    }
    @test
    fun incrementPointErr() {
        var point = Point(562)
        point++
        assertEquals(0, point.value)
    }
}