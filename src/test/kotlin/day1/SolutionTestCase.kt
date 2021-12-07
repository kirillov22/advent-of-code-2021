package day1

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SolutionTestCase {
    private lateinit var solution: Solution
    private lateinit var input: List<Int>

    @BeforeEach
    fun setUp() {
        solution = Solution()
        val s = javaClass.classLoader.getResource("day1.txt").readText().trim()
        input = s.split("\n").map { it.toInt() }
    }

    @Test
    fun `Part 1 test`() {
        val answer = solution.partOne(input)
        println(answer)
    }

    @Test
    fun `Part 2 test`() {
        val answer = solution.partTwo(input)
        println(answer)
    }

}
