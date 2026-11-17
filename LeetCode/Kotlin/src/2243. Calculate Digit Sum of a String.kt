private fun digitSum(s: String, k: Int): String {
    var res = s

    while (res.length > k) {
        var nums = res.chunked(k)
        var curr = StringBuilder()

        for (num in nums) {
            var sum = 0

            for (d in num) sum += d - '0'

            curr.append(sum.toString())
        }

        res = curr.toString()
    }

    return res
}
