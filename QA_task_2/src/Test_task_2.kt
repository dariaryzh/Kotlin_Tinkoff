import org.junit.Test
import kotlin.test.assertEquals

class TestTask2 {

    @Test
    fun testCorrectReverseNumber1() {
        val num = 586
        assertEquals("Перевёрнутое число: 685", reverseNumber(num))
    }

    @Test
    fun testCorrectReverseNumber2() {
        val num = 500
        assertEquals("Перевёрнутое число: 5", reverseNumber(num))
    }

    @Test
    fun testWrongReverse() {
        val num = 15
        assertEquals("Данные введены неверно", reverseNumber(num))
    }

    @Test
    fun testWrongInput() {
        val num = 1578
        assertEquals("Данные введены неверно", reverseNumber(num))
    }
}