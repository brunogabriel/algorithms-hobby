package brunogabriel.sorting

import io.github.brunogabriel.sorting.QuickSort
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * Created by brunogabriel on 2019-04-23.
 */
class QuickSortTest {

    companion object {
        private val tests = listOf(
            Pair(listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10), listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)),
            Pair(listOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0), listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)),
            Pair(emptyList(), emptyList()),
            Pair(listOf(-1, -1, -1, -1, -1, -1, -1, -1), listOf(-1, -1, -1, -1, -1, -1, -1, -1)),
            Pair(listOf(Int.MAX_VALUE, 9 , 2, 1, -10, 10, 8, Int.MIN_VALUE), listOf(Int.MIN_VALUE, -10, 1, 2, 8, 9, 10, Int.MAX_VALUE))
        )
    }

    private lateinit var quickSort: QuickSort

    @Test
    fun shouldSortByUsingFirstPositionPivot() {
        // given
        quickSort = QuickSort()

        // then
        tests.forEach {
            assertEquals(it.second, quickSort.sort(it.first))
        }
    }

    @Test
    fun shouldSortByUsingLastPositionPivot() {
        // given
        quickSort = QuickSort(QuickSort.PivotType.LAST)

        // then
        tests.forEach {
            assertEquals(it.second, quickSort.sort(it.first))
        }
    }

    @Test
    fun shouldSortByUsingMiddlePositionPivot() {
        // given
        quickSort = QuickSort(QuickSort.PivotType.MIDDLE)

        // then
        tests.forEach {
            assertEquals(it.second, quickSort.sort(it.first))
        }
    }
}