package io.github.brunogabriel.math

/**
 * Created by brunogabriel on 2019-10-15.
 */

/**
 * [x], [y] numbers to calculate greatest common divisor
 * @return GCD between [x] and [y]
 */
fun calculateGCD(x: Int, y: Int): Int {
    var numberX = x
    var numberY = y

    if (numberX < numberY) {
        numberX = numberY.also {
            numberY = numberX
        }
    }

    while (numberY != 0) {
        numberX = numberY.also {
            numberY = numberX % numberY
        }
    }

    return numberX
}

fun recursiveGCD(x: Int, y: Int): Int {
    return when {
        y == 0 -> x
        x < y -> recursiveGCD(y, x)
        else -> recursiveGCD(y, x % y)
    }
}

