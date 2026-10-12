private fun countSpecialIntegers(nums: IntArray): Int {
    val freq: MutableMap<Int, Int> = mutableMapOf()
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    var res = 0
    val n = nums.size

    for (i in 0..<n) {
        freq[nums[i]] = (freq[nums[i]] ?: 0) + 1

        if (nums[i] !in map) map[nums[i]] = mutableListOf()

        map[nums[i]]!!.add(i)
    }

    for ((num, freq) in freq) {
        if (freq == 3) {
            val m = map[num]!!.size
            val diff = map[num]!![1] - map[num]!![0]
            var flag = true

            for (i in 1..<m) {
                if (map[num]!![i] - map[num]!![i - 1] != diff) {
                    flag = false
                    break
                }
            }

            if (flag) {
                res++
            }
        }
    }

    return res
}
