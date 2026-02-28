import kotlin.math.abs

fun minMirrorPairDistance(nums: IntArray): Int {
    fun reverse(x: Int): Int {

        var reversed = 0
        var cpy = x

        while (cpy != 0) {
            reversed *= 10
            reversed += cpy % 10
            cpy /= 10
        }

        return reversed
    }

    fun bsearch(lst: List<Int>, i: Int): Int {
        var l = 0
        var r = lst.size

        while (l < r) {
            val mid = l + (r - l) / 2

            if (lst[mid] <= i) {
                l = mid + 1
            } else {
                r = mid
            }
        }

        return if (l == lst.size) Int.MAX_VALUE else lst[l]
    }

    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    var res = Int.MAX_VALUE

    for (i in nums.indices) {
        if (nums[i] !in map) map[nums[i]] = mutableListOf(i) else map[nums[i]]!!.add(i)
    }

    for (i in nums.indices) {
        val reversed = reverse(nums[i])

        if (reversed in map) {
            val j = bsearch(map[reversed]!!, i)
            if (j == Int.MAX_VALUE) continue
            res = minOf(res,  abs(i - j))
        }
    }

    return if (res == Int.MAX_VALUE) -1 else res
}