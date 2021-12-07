package day1

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SolutionTestCase {
    private lateinit var solution: Solution

    @BeforeEach
    fun setUp() {
        solution = Solution()
    }

    @Test
    fun test() {
        solution.doSomething()
    }

}
