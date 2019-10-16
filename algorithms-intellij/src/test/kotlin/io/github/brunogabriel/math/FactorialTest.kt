package io.github.brunogabriel.math

import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.core.Is.`is`
import org.junit.Test

class FactorialTest {
    @Test
    fun `factorial tests`() {
        // given
        val data = listOf(
            Pair(-1L, -1L),
            Pair(0L, 1L),
            Pair(1L, 1L),
            Pair(4L, 24L),
            Pair(5L, 120L),
            Pair(11L, 39916800L)
        )

        // then
        data.forEach {
            assertThat(it.second, `is`(factorial(it.first)))
        }
    }
}