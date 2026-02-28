import kotlin.math.abs

private fun minimumDistance(nums: IntArray): Int {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()

    for (num in nums) map[num] = mutableListOf()
    for (i in nums.indices) map[nums[i]]?.add(i)

    var res = Int.MAX_VALUE
    for (list in map.values) {
        if (list.size >= 3) {
            for (i in 0..<list.size - 2) {
                val j = i + 1
                val k = i + 2
                res = minOf(res, abs(list[i] - list[j]) + abs(list[j] - list[k]) + abs(list[k] - list[i]))
            }
        }
    }


    return if (res == Int.MAX_VALUE) -1 else res
}