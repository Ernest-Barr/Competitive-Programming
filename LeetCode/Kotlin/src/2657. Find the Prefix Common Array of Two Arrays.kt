fun findThePrefixCommonArray(a: IntArray, b: IntArray): IntArray {
    val n = a.size
    val res: IntArray = IntArray(n) { 0 }
    val freq: IntArray = IntArray(n + 1) { 0 }
    var count = 0

    for (i in 0..<n) {
        freq[a[i]]++
        freq[b[i]]++

        if (freq[b[i]] == 2) count++
        if (a[i] != b[i] && freq[a[i]] == 2) count++

        res[i] = count
    }

    return res
}
