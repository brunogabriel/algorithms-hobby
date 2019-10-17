package io.github.brunogabriel.sorting

/**
 * Created by brunogabriel on 2019-10-17.
 */
fun bubbleSort(list: List<Int>): List<Int> {
    val sortedList = list.toMutableList()
    for (i in 0 until sortedList.size - 1) {
        for (j in 0 until sortedList.size - i - 1) {
            if (sortedList[j] > sortedList[j + 1]) {
                sortedList[j] = sortedList[j + 1].also {
                    sortedList[j + 1] = sortedList[j]
                }
            }
        }
    }
    return sortedList.toList()
}