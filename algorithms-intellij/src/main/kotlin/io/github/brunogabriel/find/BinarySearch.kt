package io.github.brunogabriel.find

/**
 * Created by brunogabriel on 2019-10-15.
 */

/**
 * Sorted [array] and [value] to seek in it.
 * @return the position of [value] or -1 if not found.
 */
fun binarySearch(array: Array<Int>, value: Int): Int {
    var low = 0
    var high = array.size - 1
    while (low <= high) {
        val mid = low + (high - low) / 2
        when {
            array[mid] == value -> return mid
            array[mid] > value -> high = mid - 1
            else -> low = mid + 1
        }
    }
    return -1
}

/**
 * Sorted [array], [value] to seek in [array],
 * [start] and [end] represents the first and last elements position inside [array].
 * @return the position of [value] or -1 if not found.
 */
fun recursiveBinarySearch(array: Array<Int>, value: Int, start: Int, end: Int): Int {
    if (start <= end) {
        val mid = start + (end - start) / 2
        return when {
            array[mid] == value -> mid
            array[mid] > value -> recursiveBinarySearch(array, value, start, mid - 1)
            else -> recursiveBinarySearch(array, value, mid + 1, end)
        }
    }
    return -1
}

/**
 * Sorted circularly [array] assuming there's no duplicated and rotation is in anticlockwise
 * @return number of rotations
 * Samples:
 * [5, 6, 7, 1, 2, 3] = 3
 * [100, 200, 300, 400, 500, 600] = 0
 */
fun numberOfRotationsInCircularSortedArray(array: Array<Int>): Int {
    var size = array.size - 1
    var low = 0
    var high = size
    while (low <= high) {
        // Base array is sorted
        if (array[low] <= array[high]) {
            return low
        }

        val mid = low + (high - low) / 2
        val previous = (mid - 1 + size) % size
        val next = (mid + 1) % size

        // [8, 9, 10, 1, 5, 6, 7]
        if (array[mid] <= array[previous] && array[mid] <= array[next]) {
            return mid
        } else if (array[mid] <= array[high]) {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return -1
}

/**
 * Sorted circularly [array] and [value] to seek in it.
 * @return the position of [value] or -1 if not found.
 * @see numberOfRotationsInCircularSortedArray
 */
fun findElementInCircularSortedArray(array: Array<Int>, value: Int): Int {
    var size = array.size - 1
    var low = 0
    var high = size
    while (low <= high) {
        val mid = low + (high - low) / 2
        if (array[mid] == value) {
            return mid
        } else if (array[mid] <= array[high]) {
            if (value > array[mid] && value <= array[high]) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        } else {
            if (value < array[mid] && value >= array[low]) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }
    }
    return -1
}