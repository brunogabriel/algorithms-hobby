package io.github.brunogabriel.math

/**
 * Created by brunogabriel on 2019-10-15.
 */

/**
 * [number] of factorial to be calculate
 * @return the factorial number, -1 if is invalid
 * e.g.: 0! = 1, 2! = 2.1 = 1, 3! = 3.2.1 = 6
 */
fun factorial(number: Long): Long {
    if (number < 0) {
        return -1L
    } else if (number == 0L) {
        return 1L
    }
    var result = 1L
    for (i in 2..number) {
        result *= i
    }
    return result
}

fun recursiveFactorial(number: Long): Long {
    return when {
        number < 0L -> -1L
        number < 2L -> 1L
        else -> recursiveFactorial(number - 1L) * number
    }
}