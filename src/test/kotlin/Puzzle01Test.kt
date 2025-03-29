import kotlin.test.Test
import kotlin.test.assertEquals

class Puzzle01Test {
    @Test
    fun testSolve() {
        val list = readInput("puzzle01test")
        assertEquals(31, Puzzle01().solve(list))
    }
}