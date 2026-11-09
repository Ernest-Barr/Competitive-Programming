private fun countDivisibleSubstrings(word: String): Int {
    val n = word.length
    val map = intArrayOf(1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9)
    var res = 0

    for (i in 0..<n) {
        var sum = 0
        for (j in i..<n) {
            sum += map[word[j] - 'a']

            if (sum % (j - i + 1) == 0) res++
        }
    }

    return res
}
