package io.github.brunogabriel.sorting

import io.github.brunogabriel.sortingTests
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Test

/**
 * Created by brunogabriel on 2019-10-17.
 */
class QuickSortTest {
    @Test
    fun `quickSort tests`() {
        // given
        val sortData = sortingTests()
        // then
        sortData.forEach {
            assertThat(quickSortWithMidPivot(it.first), `is`(it.second))
        }
    }
}