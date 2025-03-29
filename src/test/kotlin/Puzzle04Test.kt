import kotlin.test.Test
import kotlin.test.assertEquals

class Puzzle04Test {
    @Test
    fun testSolve() {
        val list = readInput("puzzle04test")
        assertEquals(3143, Puzzle04().solve(list))
    }
}