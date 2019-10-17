package io.github.brunogabriel.sorting

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class BubbleSortTest : SortingTest() {
    @Test
    fun `bubbleSort tests`() {
        bubbleSort(sortData[0].first)
        sortData.forEach {
            bubbleSort(it.first)
            assertThat(it.first, `is`(it.second))
        }
    }
}