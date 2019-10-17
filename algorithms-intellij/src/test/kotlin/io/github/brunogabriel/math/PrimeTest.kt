package io.github.brunogabriel.math

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class PrimeTest {
    private val primes =
        listOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97)
    private val nonPrimes = listOf(4, 6, 8, 10, 12, 15, 88, 96, 99)

    @Test
    fun `prime tests`() {
        primes.forEach {
            assertThat(prime(it), `is`(true))
        }
        nonPrimes.forEach {
            assertThat(prime(it), `is`(false))
        }
    }
}