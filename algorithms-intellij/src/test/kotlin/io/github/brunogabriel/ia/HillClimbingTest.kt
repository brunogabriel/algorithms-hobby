package io.github.brunogabriel.ia

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test

class HillClimbingTest {
    private lateinit var randomFunction: () -> Double
    private lateinit var maxFunction: (Double) -> Double

    @Before
    fun setup() {
        randomFunction = mock()
        maxFunction = mock()
    }

    @Test
    fun `hillClimbing tests`() {
        // given
        whenever(randomFunction()).thenReturn(1.0, 2.0, 3.0)
        whenever(maxFunction(1.0)).thenReturn(1.0)
        whenever(maxFunction(2.0)).thenReturn(2.0)
        whenever(maxFunction(3.0)).thenReturn(3.0)

        // when
        val result = hillClimbing(2L, randomFunction, maxFunction)

        // then
        assertThat(result, `is`(3.0))
    }
}

