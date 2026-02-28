fun addDigits(num: Int): Int {

    // https://en.wikipedia.org/wiki/Digital_root
    fun sum(x: Int): Int {
        var cpy = x
        var res = 0
        while (cpy > 0) {
            res += cpy % 10
            cpy /= 10
        }

        return res
    }

    var res = num
    val set: MutableSet<Int> = mutableSetOf()

    while (res !in set) {
        set.add(res)
        res = sum(res)
    }

    return res
}