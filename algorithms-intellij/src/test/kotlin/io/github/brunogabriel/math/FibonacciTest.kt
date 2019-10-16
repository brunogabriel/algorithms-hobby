package io.github.brunogabriel.math

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by brunogabriel on 2019-10-15.
 */
class FibonacciTest {
    private var fibonacciArray = arrayOf(
        0L,
        1L,
        1L,
        2L,
        3L,
        5L,
        8L,
        13L,
        21L,
        34L,
        55L,
        89L,
        144L,
        233L,
        377L,
        610L,
        987L,
        1597L,
        2584L,
        4181L,
        6765L,
        10946L,
        17711L,
        28657L,
        46368L,
        75025L,
        121393L,
        196418L,
        317811L
    )


    @Test
    fun `fibonacci tests`() {
        fibonacciArray.forEachIndexed { index, value ->
            assertThat(value, `is`(fibonacci(index.toLong())))
        }
        assertThat(-1, `is`(fibonacci(-1L)))
    }

    @Test
    fun `recursiveFibonacci tests`() {
        fibonacciArray.forEachIndexed { index, value ->
            assertThat(value, `is`(recursiveFibonacci(index.toLong())))
        }
    }
}