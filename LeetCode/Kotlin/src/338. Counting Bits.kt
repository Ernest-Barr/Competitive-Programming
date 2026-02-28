fun countBits(n: Int): IntArray {
    val res: IntArray = IntArray(n + 1) {0}

    for (i in 0..n) {
        var num = i
        var c = 0
        while (num != 0) {
            num = num and num - 1
            c++
        }

        res[i] = c
    }

    return res
}