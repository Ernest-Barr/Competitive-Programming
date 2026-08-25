import kotlin.math.*

private fun scoreOfString(s: String): Int {
    var res = 0
    val n = s.length

    for (i in 1..<n) {
        res += abs(s[i - 1] - s[i])
    }

    return res
}
