private fun countSpecialIntegers(nums: IntArray): Int {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    var res = 0
    val n = nums.size

    for (i in 0..<n) {
        if (nums[i] !in map) map[nums[i]] = mutableListOf()
        map[nums[i]]!!.add(i)
    }

    for ((_, list) in map) {
        if (list.size >= 3) {
            val diff = list[1] - list[0]
            var flag = true

            for (i in 1..<list.size) {
                if (list[i] - list[i - 1] != diff) {
                    flag = false
                    break
                }
            }

            if (flag) res++
        }
    }

    return res
}
