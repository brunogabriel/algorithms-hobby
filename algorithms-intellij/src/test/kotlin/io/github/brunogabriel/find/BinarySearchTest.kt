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
        assertThat(-1, `is`(binarySearch(array, -1)))
        assertThat(-1, `is`(binarySearch(array, 100000)))
    }

    @Test
    fun `recursiveBinarySearch tests`() {
        // given
        val array = arrayOf(0, 1, 2, 10, 100, 123, 124, 199, 1999, 99999)

        // then
        array.forEachIndexed { index, value ->
            assertThat(index, `is`(recursiveBinarySearch(array, value, 0, array.size - 1)))
        }
        assertThat(-1, `is`(recursiveBinarySearch(array, -1, 0, array.size - 1)))
        assertThat(-1, `is`(recursiveBinarySearch(array, 100000, 0, array.size - 1)))
    }

    @Test
    fun `numberOfRotationsInCircularSortedArray tests`() {
        assertThat(3, `is`(numberOfRotationsInCircularSortedArray(arrayOf(7, 8, 9, 1, 2, 3))))
        assertThat(0, `is`(numberOfRotationsInCircularSortedArray(arrayOf(1, 2, 100))))
        assertThat(0, `is`(numberOfRotationsInCircularSortedArray(arrayOf(1))))
        assertThat(3, `is`(numberOfRotationsInCircularSortedArray(arrayOf(8, 9, 10, 1, 3, 4, 5))))
        assertThat(-1, `is`(numberOfRotationsInCircularSortedArray(arrayOf())))
    }

    @Test
    fun `findElementInCircularSortedArray tests`() {
        // given
        val array = arrayOf(5, 6, 7, 1, 2, 3)

        // when
        array.forEachIndexed { index, value ->
            assertThat(index, `is`(findElementInCircularSortedArray(array, value)))
        }
        assertThat(-1, `is`(findElementInCircularSortedArray(emptyArray(), 10)))
        assertThat(-1, `is`(findElementInCircularSortedArray(array, 10)))
    }
}