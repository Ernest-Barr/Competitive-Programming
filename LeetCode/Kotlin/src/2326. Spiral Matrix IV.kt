import DataStructure.ListNode

private fun spiralMatrix(
    m: Int,
    n: Int,
    head: ListNode?,
): Array<IntArray> {
    val res: Array<IntArray> = Array(m) { IntArray(n) { -1 } }
    var list = head

    var l = 0
    var r = n - 1
    var t = 0
    var b = m - 1

    while (l <= r && t <= b) {
        for (i in l..r) {
            res[t][i] = list!!.`val`
            list = list?.next
            if (list == null) return res
        }

        t++

        for (i in t..b) {
            res[i][r] = list!!.`val`
            list = list?.next
            if (list == null) return res
        }

        r--

        for (i in r downTo l) {
            res[b][i] = list!!.`val`
            list = list?.next
            if (list == null) return res
        }

        b--

        for (i in b downTo t) {
            res[i][l] = list!!.`val`
            list = list?.next
            if (list == null) return res
        }

        l++
    }

    return res
}
