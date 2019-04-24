package io.github.brunogabriel.sorting

/**
 * Created by brunogabriel on 2019-04-23.
 */
class QuickSort(private val pivotType: PivotType = PivotType.FIRST) {

    fun sort(items: List<Int>): List<Int> {
        return when(pivotType) {
            PivotType.FIRST -> sortByFirst(items)
            PivotType.LAST -> sortByLast(items)
            PivotType.MIDDLE -> sortByMiddle(items)
        }
    }

    private fun sortByMiddle(items: List<Int>): List<Int> {
        return if (items.size < 2) {
            items
        } else {
            val pivot = items[items.size/2]
            val middle = items.filter { it == pivot }
            val less = items.filter { it < pivot }
            val greater = items.filter { it > pivot }
            sortByMiddle(less) + middle + sortByMiddle(greater)
        }
    }

    private fun sortByLast(items: List<Int>): List<Int> {
        return if (items.size < 2) {
            items
        } else {
            val pivot = items.last()
            val (less, greater) = items.dropLast(1).partition { it <= pivot }
            sortByLast(less) + pivot + sortByLast(greater)
        }
    }

    private fun sortByFirst(items: List<Int>): List<Int> {
        return if (items.size < 2) {
            items
        } else {
            val pivot = items.first()
            val (less, greater) = items.drop(1).partition { it <= pivot }
            sortByFirst(less) + pivot + sortByFirst(greater)
        }
    }

    enum class PivotType {
        FIRST, LAST, MIDDLE
    }
}