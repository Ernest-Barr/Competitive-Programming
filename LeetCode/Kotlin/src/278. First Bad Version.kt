// Uses an API that is defined by LeetCode
private fun isBadVersion(version: Int) = false

private fun firstBadVersion(n: Int): Int {
    var l = 1
    var r = n

    while (l < r) {
        val m = l + (r - l) / 2
        if (isBadVersion(m)) r = m else l = m + 1
    }

    return l
}