package io.github.brunogabriel.math

/**
 * Created by brunogabriel on 2019-10-15.
 */

/**
 * [number] of fibonacci
 * @return the element present in fibonacci sequence [1, 1, 2, 3, 5, ..., ], -1 if is invalid
 */
fun fibonacci(number: Long): Long {
    if (number < 0L) {
        return -1
    }

    var element = 0L
    var next = 1L

    for (i in 1..number) {
        element = next.also {
            next += element
        }
    }
    return element
}

fun recursiveFibonacci(number: Long): Long {
    return when {
        number < 0L -> -1L
        number == 0L -> 0L
        number <= 2 -> 1L
        else -> recursiveFibonacci(number - 1L) + recursiveFibonacci(number - 2L)
    }
}