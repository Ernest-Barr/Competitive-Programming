private fun removeVowels(s: String): String {
    val res: StringBuilder = StringBuilder()

    for (c in s) {
        if (c !in "aeiou") res.append(c)
    }

    return res.toString()
}
