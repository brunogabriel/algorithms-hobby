package io.github.brunogabriel.math

/**
 * Created by brunogabriel on 2019-04-23.
 */
class Fibonacci {

    fun linearFibonacci(number: Int): Long {
        if (number == 0) {
            return 0L
        }

        var first = 0L
        var second = 1L

        for (i in 2..number) {
            first = second.also { second += first }
        }

        return second
    }

    tailrec fun fibonacciTailRec(number: Int, first: Long = 0L, second: Long = 1L): Long {
        return if (number == 0) {
            first
        } else {
            fibonacciTailRec(number-1, second, first + second)
        }
    }

    fun fibonacciRecursive(number: Int): Long {
        return if (number <= 1) {
            number.toLong()
        } else {
            fibonacciRecursive(number-1) + fibonacciRecursive(number-2)
        }
    }
}