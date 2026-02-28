fun minBitwiseArray(nums: List<Int>): IntArray {
    val n = nums.size
    val res: IntArray = IntArray(n) { -1 }

    for (i in res.indices) {
        for (num in 1..nums[i]) {
            if (num or (num + 1) == nums[i]) {
                res[i] = num
                break
            }
        }
    }

    return res
}