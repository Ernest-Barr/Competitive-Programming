fun minimumAbsDifference(nums: IntArray): List<List<Int>> {
    nums.sort()

    val n = nums.size
    var min = Int.MAX_VALUE
    val res: MutableList<List<Int>> = mutableListOf()

    for (i in 0..<n - 1) min = minOf(min, nums[i + 1] - nums[i])
    for (i in 0..<n - 1) if (nums[i + 1] - nums[i] == min) res.add(listOf(nums[i], nums[i + 1]))

    return res
}