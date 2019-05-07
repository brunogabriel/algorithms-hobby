package brunogabriel.logic

import io.github.brunogabriel.logic.Anagram
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * Created by brunogabriel on 2019-05-07.
 */
class AnagramTest {

    companion object {
        private val tests = listOf(
            AnagramHelper("cat", "acx", false),
            AnagramHelper("arc", "car", true),
            AnagramHelper("elbow", "below", true),
            AnagramHelper("night", "thing", true),
            AnagramHelper("brag", "grab", true),
            AnagramHelper("cat", "act", true),
            AnagramHelper("save", "vase", true),
            AnagramHelper("stressed", "desserts", true),
            AnagramHelper("stressed", "dessert", false),
            AnagramHelper("abc", "ab", false),
            AnagramHelper("bca", "ca", false),
            AnagramHelper("a", "", false),
            AnagramHelper("", "a", false),
            AnagramHelper("", "", true))
    }

    lateinit var anagram: Anagram

    @BeforeEach
    fun setUp() {
        anagram = Anagram()
    }

    @Test
    fun shouldUseAreAnagrams() {
        tests.forEach { assertEquals(it.result, anagram.areAnagrams(it.firstWord, it.secondWord)) }
    }

    @Test
    fun shouldUseAreAnagramsMethod2() {
        tests.forEach { assertEquals(it.result, anagram.areAnagramsMethod2(it.firstWord, it.secondWord)) }
    }

    private data class AnagramHelper(val firstWord: String,
                                     val secondWord: String,
                                     val result: Boolean)
}