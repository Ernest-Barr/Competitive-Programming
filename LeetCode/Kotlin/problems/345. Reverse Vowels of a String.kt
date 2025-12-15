private fun reverseVowels(s: String): String {
    val str = StringBuilder(s)
    val vowels = setOf('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')

    var l = 0
    var r = str.length - 1

    while (l < r) {
        when {
            str[l] in vowels && str[r] in vowels -> {
                val temp = str[l]
                str[l++] = str[r]
                str[r--] = temp
            }

            str[l] !in vowels -> l++
            str[r] !in vowels -> r--
        }
    }

    return str.toString()
}