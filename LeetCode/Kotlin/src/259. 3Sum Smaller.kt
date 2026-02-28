fun threeSumSmaller(nums: IntArray, target: Int): Int {
    nums.sort()

    val n = nums.size
    var res = 0

    for (i in nums.indices) {
        var l = i + 1
        var r = n - 1

        while (l < r) {
            val sum = nums[i] + nums[l] + nums[r]
            when {
                sum < target -> {
                    res += r - l
                    l++
                }

                else -> {
                    r--
                }
            }
        }
    }

    return res
}