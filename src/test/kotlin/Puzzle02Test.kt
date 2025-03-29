import kotlin.test.Test
import kotlin.test.assertEquals

class Puzzle02Test {
    @Test
    fun testSolve() {
        val list = readInput("puzzle02test")
        assertEquals("2019-06-05T12:15:00+00:00", Puzzle02().solve(list))
    }
}