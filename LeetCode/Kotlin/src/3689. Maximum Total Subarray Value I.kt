private fun maxTotalValue(nums: IntArray, k: Int): Long {
    return (nums.max().toLong() - nums.min()) * k
}
