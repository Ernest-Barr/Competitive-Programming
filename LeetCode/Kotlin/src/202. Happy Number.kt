fun isHappy(n: Int): Boolean {
    var res = n
    val seen: MutableSet<Int> = mutableSetOf()

    fun sum(i: Int): Int {
        var num = i
        var sum = 0
        while (num != 0) {
            val ones = num % 10
            num /= 10
            sum += ones * ones
        }
        return sum
    }

    while (res != 1) {
        res = sum(res)
        if (res in seen) break else seen.add(res)
    }

    return res == 1
}