fun sumFourDivisors(nums: IntArray): Int {
    fun divisors(num: Int): Int {
        var i = 1
        val set: MutableSet<Int> = mutableSetOf()

        while (i * i <= num) {
            if (num % i == 0) {
                set.add(i)
                set.add(num / i)
            }
            i++
        }

        return if (set.size == 4) set.sum() else 0
    }

    var res = 0
    val map: MutableMap<Int, Int> = mutableMapOf()

    for (num in nums) {
        res += if (num in map) map[num]!! else {
            map[num] = divisors(num)
            map[num]!!
        }
    }

    return res
}