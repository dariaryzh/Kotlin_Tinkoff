import org.junit.Test
import org.junit.Assert.assertArrayEquals

class TestReplaceNegatives {

    @Test
    fun testArrayUsual() {
        val arr = arrayOf(5, -8 , 0, -55)
        assertArrayEquals(arrayOf(-8, -55, 0, 5), replaceNegatives(arr))
    }

    @Test
    fun testArrayOnlyPositives() {
        val arr = arrayOf(55, 108, 98)
        assertArrayEquals(arrayOf(98, 108, 55), replaceNegatives(arr))
    }

    @Test
    fun testArrayOnlyNegatives() {
        val arr = arrayOf(-10, -99, -108)
        assertArrayEquals(arrayOf(-10, -99, -108), replaceNegatives(arr))
    }

    @Test
    fun testArrayEmpty() {
        val arr = arrayOf<Int>()
        assertArrayEquals(arrayOf<Int>(), replaceNegatives(arr))
    }

    @Test
    fun testArrayNothingToReplace() {
        val arr = arrayOf(-88, -22, 8)
        assertArrayEquals(arrayOf(-88, -22, 8), replaceNegatives(arr))
    }
}