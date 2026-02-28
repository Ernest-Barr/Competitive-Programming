private fun doesAliceWin(s: String): Boolean {
    return s.any {c -> c in "aeiou"}
}

// Test cases not necessary, alice wins as long as a vowel exists in the input string.