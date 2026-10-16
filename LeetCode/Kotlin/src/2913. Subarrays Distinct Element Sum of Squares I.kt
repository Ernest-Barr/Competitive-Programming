private fun sumCounts(nums: List<Int>): Int {
    var res = 0
    val n = nums.size

    for (i in 0..<n) {
        val count: MutableSet<Int> = mutableSetOf()
        for (j in i..<n) {
            count.add(nums[j])
            res += count.size * count.size
        }
    }

    return res
}
