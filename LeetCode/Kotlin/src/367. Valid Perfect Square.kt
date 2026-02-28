private fun isPerfectSquare(num: Int): Boolean {
    var l: Long = 1L
    var r: Long = num.toLong()

    while (l <= r) {
        val m: Long = l + (r - l) / 2L

        if (m * m == num.toLong()) {
            return true
        } else if (m * m < num.toLong()) {
            l = m + 1L
        } else {
            r = m - 1L
        }
    }

    return false
}

fun main() {

}