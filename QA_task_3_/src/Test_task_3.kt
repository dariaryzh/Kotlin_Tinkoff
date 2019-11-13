import org.junit.Test
import kotlin.test.assertEquals

class TestPrintSeason {

    @Test
    fun testWinter() {
        val winter = "Зима"
        assertEquals(winter, printSeason(12))
        assertEquals(winter, printSeason(1))
        assertEquals(winter, printSeason(2))
    }

    @Test
    fun testSpring() {
        val spring = "Весна"
        assertEquals(spring, printSeason(3))
        assertEquals(spring, printSeason(4))
        assertEquals(spring, printSeason(5))
    }

    @Test
    fun testSummer() {
        val summer = "Лето"
        assertEquals(summer, printSeason(6))
        assertEquals(summer, printSeason(7))
        assertEquals(summer, printSeason(8))
    }

    @Test
    fun testAutumn() {
        val autumn = "Осень"
        assertEquals(autumn, printSeason(9))
        assertEquals(autumn, printSeason(10))
        assertEquals(autumn, printSeason(11))
    }

    @Test
    fun testWrongInput() {
        val error = "Данные введены неверно"
        assertEquals(error, printSeason(45))
        assertEquals(error, printSeason(0))
        assertEquals(error, printSeason(-12))
    }
}