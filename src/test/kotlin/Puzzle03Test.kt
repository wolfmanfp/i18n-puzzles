import kotlin.test.Test
import kotlin.test.assertEquals

class Puzzle03Test {
    @Test
    fun testSolve() {
        val list = readInput("puzzle03test")
        assertEquals(2, Puzzle03().solve(list))
    }
}