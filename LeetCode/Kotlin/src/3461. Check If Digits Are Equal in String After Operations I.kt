private fun hasSameDigits(s: String): Boolean {
    var res = s

    while (res.length > 2) {
        var new = ""
        for (i in 0..<res.length-1) {
            val j: Int = res[i] - '0'
            val k: Int = res[i + 1] - '0'
            new += ((j + k) % 10).toString()
        }
        res = new
    }

    return res[0] == res[1]
}