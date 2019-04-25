package io.github.brunogabriel.math

/**
 * Created by brunogabriel on 2019-04-23.
 */
class Fibonacci {

    companion object {
        private val FIBONACCI_MATRIX = listOf(listOf(1L, 1L), listOf(1L, 0L))
    }

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

    fun fibonacciDynamic(number: Int): Long {
        if (number == 0 || number == 1) {
            return number.toLong()
        }

        var fibonacciNumbers = LongArray(number + 1).also {
            it[0] = 0
            it[1] = 1
        }

        for (i in 2..number) {
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2]
        }

        return fibonacciNumbers[number]
    }

    fun fibonacciMatrixNumber(number: Int): Long {
        if (number == 0 || number == 1) {
            return number.toLong()
        }
        return matrixEvaluation(number, FIBONACCI_MATRIX)[0][1]
    }

    private fun matrixEvaluation(number: Int, matrix: List<List<Long>>): List<List<Long>> {
        return when {
            number == 1 -> return matrix
            number % 2 == 0 -> {
                val result = matrixEvaluation(number/2, matrix)
                listMultiply(result, result)
            }
            else -> {
                val result = matrixEvaluation((number-1)/2, matrix)
                listMultiply(listMultiply(result, result), matrix)
            }
        }
    }

    private fun listMultiply(first: List<List<Long>>, second: List<List<Long>>): List<List<Long>> {
       return listOf(
           listOf(first[0][0] * second[0][0] + first[0][1]* second[1][0], first[0][0] * second[0][1] + first[0][1]* second[1][1]),
           listOf(first[1][0] * second[0][0] + first[1][1]* second[1][0], first[1][0] * second[0][1] + first[1][1]* second[1][1])
       )
    }
}