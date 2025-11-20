fun rotate(nums: IntArray, k: Int): Unit {
    val n = nums.size
    val res: IntArray = IntArray(n) { 0 }

    for (i in nums.indices) res[(i + k) % n] = nums[i]
    for (i in res.indices) nums[i] = res[i]
}