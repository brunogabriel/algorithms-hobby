package io.github.brunogabriel.find

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

/**
 * Created by brunogabriel on 2019-10-15.
 */
class BinarySearchTest {

    @Test
    fun `binarySearch tests`() {
        // given
        val array = arrayOf(0, 1, 2, 10, 100, 123, 124, 199, 1999, 99999)

        // then
        array.forEachIndexed { index, value ->
            assertThat(index, `is`(binarySearch(array, value)))
        }
        assertThat(binarySearch(array, -1), `is`(-1))
        assertThat(binarySearch(array, 100000), `is`(-1))
    }

    @Test
    fun `recursiveBinarySearch tests`() {
        // given
        val array = arrayOf(0, 1, 2, 10, 100, 123, 124, 199, 1999, 99999)

        // then
        array.forEachIndexed { index, value ->
            assertThat(index, `is`(recursiveBinarySearch(array, value, 0, array.size - 1)))
        }
        assertThat(recursiveBinarySearch(array, -1, 0, array.size - 1), `is`(-1))
        assertThat(recursiveBinarySearch(array, 100000, 0, array.size - 1), `is`(-1))
    }

    @Test
    fun `numberOfRotationsInCircularSortedArray tests`() {
        assertThat(numberOfRotationsInCircularSortedArray(arrayOf(7, 8, 9, 1, 2, 3)), `is`(3))
        assertThat(numberOfRotationsInCircularSortedArray(arrayOf(1, 2, 100)), `is`(0))
        assertThat(numberOfRotationsInCircularSortedArray(arrayOf(1)), `is`(0))
        assertThat(numberOfRotationsInCircularSortedArray(arrayOf(8, 9, 10, 1, 3, 4, 5)), `is`(3))
        assertThat(numberOfRotationsInCircularSortedArray(arrayOf()), `is`(-1))
    }

    @Test
    fun `findElementInCircularSortedArray tests`() {
        // given
        val array = arrayOf(5, 6, 7, 1, 2, 3)

        // when
        array.forEachIndexed { index, value ->
            assertThat(findElementInCircularSortedArray(array, value), `is`(index))
        }
        assertThat(findElementInCircularSortedArray(emptyArray(), 10), `is`(-1))
        assertThat(findElementInCircularSortedArray(array, 10), `is`(-1))
    }
}