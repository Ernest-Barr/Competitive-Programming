private fun predictTheWinnerRecursive(nums: IntArray): Boolean {
    fun helper(l: Int, r: Int): Int =
        if (l == r) nums[r] else maxOf(nums[l] - helper(l + 1, r), nums[r] - helper(l, r - 1))

    return helper(0, nums.size - 1) >= 0
}
