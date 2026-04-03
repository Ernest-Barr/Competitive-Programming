fun canBeEqual(
    s1: String,
    s2: String,
): Boolean {
    val n = s1.length

    for (i in 0..<2) {
        if (s1[i] != s2[i]) {
            if (s1[i] != s2[i + 2]) return false
        }
    }

    return true
}
