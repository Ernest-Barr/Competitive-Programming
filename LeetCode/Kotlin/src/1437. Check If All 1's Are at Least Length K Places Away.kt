fun kLengthApart(nums: IntArray, k: Int): Boolean {

    var count = 0
    var seen = false

    for (i in nums.indices) {
        when (nums[i]) {
            0 -> if (seen) count++
            1 -> {
                if (!seen) {
                    seen = true
                    continue
                }

                if (count < k) return false
                count = 0
            }
        }
    }

    return true
}