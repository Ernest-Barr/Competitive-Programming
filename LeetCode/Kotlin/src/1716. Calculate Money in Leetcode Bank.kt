private fun totalMoney(n: Int): Int {
    var start = 1
    var curr = 1
    var mod = 7

    var res = 0

    for (i in 1..n) {
        res += curr
        if (curr % mod == 0) {
            start++
            mod++
            curr = start
            continue
        }
        curr++
    }

    return res
}