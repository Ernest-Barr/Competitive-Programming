fun minDeletionSize(strs: Array<String>): Int {
    var res = 0
    val n = strs.size
    val m = strs[0].length
    for (i in 0..<m) {
        for (j in 0..<n) {
            if (j > 0) {
                if (strs[j][i] < strs[j - 1][i]) {
                    res++
                    break
                }
            }
        }
    }

    return res
}