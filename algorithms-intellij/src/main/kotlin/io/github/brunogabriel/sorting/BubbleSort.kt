package io.github.brunogabriel.sorting

/**
 * Created by brunogabriel on 2019-10-17.
 */
fun bubbleSort(array: Array<Int>) {
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                array[j] = array[j + 1].also {
                    array[j + 1] = array[j]
                }
            }
        }
    }
}