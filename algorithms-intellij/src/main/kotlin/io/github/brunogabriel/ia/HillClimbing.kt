package io.github.brunogabriel.ia

/**
 * [numberOfIterations] the number of iterations to find optimum local
 * [randomFunction] a function that generates a number between min and max
 * e.g.: ThreadLocalRandom.current().nextDouble(0.0, 2.0)
 * [maxFunction] a function that calculate a number to be maximized
 * e.g.: exp(-x * x) * pow(sin(3.0 * Math.PI * x), 2.0)
 */
fun hillClimbing(
    numberOfIterations: Long,
    randomFunction: () -> Double,
    maxFunction: (Double) -> Double
): Double {
    var result = randomFunction()
    for (i in 0L until numberOfIterations) {
        val randomValue = randomFunction()
        if (maxFunction(randomValue) > maxFunction(result)) {
            result = randomValue
        }
    }
    return result
}