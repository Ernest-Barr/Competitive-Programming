fun numSteps(s: String): Int {
    val q: MutableList<Char> = s.toMutableList()
    var res = 0

    while (q.size != 1) {
        when (q.last()) {
            '0' -> {
                q.removeLast()
            }

            '1' -> {
                val n = q.size
                var i = n - 1

                while (i >= 0 && q[i] != '0') q[i--] = '0'

                when (i) {
                    -1 -> q.add(0, '1')
                    else -> q[i] = '1'
                }
            }
        }

        res++
    }

    return res
}
