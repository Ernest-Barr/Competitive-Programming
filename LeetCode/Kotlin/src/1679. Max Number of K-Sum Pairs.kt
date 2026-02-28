private fun maxOperations(nums: IntArray, k: Int): Int {
    nums.sort()

    var l = 0
    var r = nums.size - 1
    var res = 0
    while (l < r) {
        val sum = nums[l] + nums[r]

        when {
            sum == k -> {
                res++
                l++
                r--
            }

            sum < k -> l++
            sum > k -> r--
        }
    }

    return res
}