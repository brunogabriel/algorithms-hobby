package io.github.brunogabriel.math

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by brunogabriel on 2019-10-15.
 */
class EuclidesTest {
    private val data = listOf(
        Triple(1000, 0, 1000),
        Triple(0, 0, 0),
        Triple(150, 304, 2),
        Triple(1000, 10, 10),
        Triple(150, 9, 3)
    )

    @Test
    fun `calculateGCD tests`() {
        data.forEach {
            assertThat(calculateGCD(it.first, it.second), `is`(it.third))
        }
    }

    @Test
    fun `recursiveGCD tests`() {
        data.forEach {
            assertThat(recursiveGCD(it.first, it.second), `is`(it.third))
        }
    }
}