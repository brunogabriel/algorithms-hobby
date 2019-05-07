package io.github.brunogabriel.logic

/**
 * Created by brunogabriel on 2019-05-07.
 */
class Anagram {

    fun areAnagrams(word1: String, word2: String): Boolean {
        return word1.toCharArray().sortedArray().contentEquals(word2.toCharArray().sortedArray())
    }

    fun areAnagramsMethod2(word1: String, word2: String): Boolean {
        if(word1.length != word2.length) {
            return false
        } else {

            val word1List = word1.toMutableList()
            val word2List = word2.toMutableList()

            for (currentLetter in word1List) {
                if (word2List.contains(currentLetter)) {
                    word2List.remove(currentLetter)
                } else {
                    return false
                }
            }
            return word2List.isEmpty()
        }
    }
}