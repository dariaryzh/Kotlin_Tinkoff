import org.junit.Test
import kotlin.test.assertEquals

class TestTask1 {

    @Test
    fun testCorrectIntputPositiveNum() {
        val num = "586"
        assertEquals("Вы ввели число: 586", checkInput(num))
    }

    @Test
    fun testCorrectIntputNegativeNum() {
        val num = "-587"
        assertEquals("Вы ввели число: -587", checkInput(num))
    }

    @Test
    fun testCorrectIntputZeroNum() {
        val num = "0"
        assertEquals("Вы ввели число: 0", checkInput(num))
    }

    @Test
    fun testWrongInputNothing() {
        val num = ""
        assertEquals(" не является числом", checkInput(num))
    }

    @Test
    fun testWrongInputNotNum() {
        val num = "6rgh46^"
        assertEquals("6rgh46^ не является числом", checkInput(num))
    }
}