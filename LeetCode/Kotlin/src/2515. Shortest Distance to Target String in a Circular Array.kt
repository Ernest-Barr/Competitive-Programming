private fun closestTarget(
    words: Array<String>,
    target: String,
    start: Int,
): Int {
    val n = words.size

    for (i in words.indices) {
        if (words[(start + i) % n] == target || words[(start - i + n) % n] == target) {
            return i
        }
    }

    return -1
}
