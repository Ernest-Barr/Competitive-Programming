import kotlin.math.abs

fun isAdjacentDiffAtMostTwo(s: String): Boolean {
    val n = s.length

    for (i in 1..<n) {
        if (abs((s[i - 1] - '0') - (s[i] - '0')) > 2) return false
    }

    return true
}
