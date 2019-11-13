import org.junit.Test
import kotlin.test.assertEquals

class TestTask5 {

    @Test
    fun testNumberIntoWords() {
        assertEquals("тысяча", numberIntoWords(1000))
        assertEquals("пятьсот восемьдесят два", numberIntoWords(582))
        assertEquals("шестьсот тринадцать", numberIntoWords(613))
        assertEquals("четыреста два", numberIntoWords(402))
        assertEquals("сто", numberIntoWords(100))
        assertEquals("сорок восемь", numberIntoWords(48))
        assertEquals("пятьдесят", numberIntoWords(50))
        assertEquals("тринадцать", numberIntoWords(13))
        assertEquals("восемь", numberIntoWords(8))
        assertEquals("Данные введены неверно", numberIntoWords(0))
        assertEquals("Данные введены неверно", numberIntoWords(1532))
        assertEquals("Данные введены неверно", numberIntoWords(-532))
    }
}

