package io.github.brunogabriel.math

import kotlin.math.sqrt

/**
 * [number]
 * @return if this number is prime, divided by yourself or 1 only
 */
fun prime(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    for (i in 2..sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}