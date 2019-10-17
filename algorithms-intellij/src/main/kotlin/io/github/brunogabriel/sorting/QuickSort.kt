package io.github.brunogabriel.sorting

/**
 * Created by brunogabriel on 2019-10-17.
 */
fun quickSortWithMidPivot(list: List<Int>): List<Int> {
    return if (list.size > 1) {
        val pivot = list[list.size / 2]
        val less = list.filter { it < pivot }
        val equal = list.filter { it == pivot }
        val greater = list.filter { it > pivot }
        quickSortWithMidPivot(less) + equal + quickSortWithMidPivot(greater)
    } else {
        list
    }
}