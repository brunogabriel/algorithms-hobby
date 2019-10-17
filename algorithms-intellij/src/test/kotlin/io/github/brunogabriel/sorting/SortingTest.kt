package io.github.brunogabriel.sorting

open class SortingTest {
    val sortData = listOf(
        Pair(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9), arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)),
        Pair(arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 0), arrayOf(0, 2, 3, 4, 5, 6, 7, 8, 9)),
        Pair(arrayOf(1, 10, 1, 10, 10, 100, -999, 1), arrayOf(-999, 1, 1, 1, 10, 10, 10, 100)),
        Pair(arrayOf(-1, 100, -55, 100, 1999, 999, -999, 127), arrayOf(-999, -55, -1, 100, 100, 127, 999, 1999))
    )
}