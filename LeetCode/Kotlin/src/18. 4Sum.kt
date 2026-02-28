private fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
    val res: MutableSet<List<Int>> = mutableSetOf()
    val t = target.toLong()
    nums.sort()

    for (i in 0..<nums.size - 3) {
        if (i > 0 && nums[i] == nums[i - 1]) continue
        for (j in i + 1..<nums.size - 2) {
            var l = j + 1
            var r = nums.size - 1
            while (l < r) {
                val sum: Long = nums[i].toLong() + nums[j].toLong() + nums[l].toLong() + nums[r].toLong()
                when {
                    sum == t -> {
                        res.add(listOf(nums[i], nums[j], nums[l], nums[r]))
                        l++
                        r--
                    }

                    sum < t -> l++
                    sum > t -> r--
                }
            }
        }
    }
    return res.toList()
}