package brunogabriel.math

import io.github.brunogabriel.math.Fibonacci
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by brunogabriel on 2019-04-23.
 */
class FibonacciTest {

    companion object {
        private val tests = listOf(
            Pair(0, 0L),
            Pair(1, 1L),
            Pair(2, 1L),
            Pair(3, 2L),
            Pair(4, 3L),
            Pair(5, 5L),
            Pair(6, 8L),
            Pair(7, 13L),
            Pair(8, 21L),
            Pair(9, 34L),
            Pair(10, 55L),
            Pair(11, 89L),
            Pair(12, 144L),
            Pair(13, 233L),
            Pair(14, 377L),
            Pair(15, 610L),
            Pair(16, 987L),
            Pair(30, 832040L),
            Pair(40, 102334155L),
            Pair(50, 12586269025L),
            Pair(60, 1548008755920L)
        )
    }

    private lateinit var fibonacci: Fibonacci

    @BeforeEach
    fun setUp() {
        fibonacci = Fibonacci()
    }

    @Test
    fun shouldCalculateByLinearMethod() {
        tests.forEach { assertEquals(it.second, fibonacci.linearFibonacci(it.first)) }
    }

    @Test
    fun shouldCalculateByTailrecMethod() {
        tests.forEach { assertEquals(it.second, fibonacci.fibonacciTailRec(it.first)) }
    }

    @Test
    fun shouldCalculateByRecursiveMethod() {
        // dropLast 2 because its expensive to calculate
        tests.dropLast(2).forEach { assertEquals(it.second, fibonacci.fibonacciRecursive(it.first)) }
    }

    @Test
    fun shouldCalculateByFibonacciDynamic() {
        tests.forEach { assertEquals(it.second, fibonacci.fibonacciDynamic(it.first)) }
    }

    @Test
    fun shouldCalculateByFibonacciMatrix() {
        tests.forEach { assertEquals(it.second, fibonacci.fibonacciMatrixNumber(it.first)) }
    }
}