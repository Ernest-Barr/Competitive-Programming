private fun maxSumOfSquares(num: Int, sum: Int): String {
    val res: StringBuilder = StringBuilder()
    var count = 0

    val nines = sum / 9
    count += nines * 9

    res.append("9".repeat(nines))

    if (res.length + 1 <= num) {
        res.append(sum % 9)
        count += sum % 9
    }

    val zeroes = num - res.length

    if (zeroes > 0) res.append("0".repeat(num - res.length))

    return if (count == sum && res.length == num) res.toString() else ""
}
