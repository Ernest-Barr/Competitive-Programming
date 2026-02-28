fun productExceptSelf(nums: IntArray): IntArray {
    // Pass One: Compute Prefix product up to that point
    // Pass Two: Cmpute suffix product down to that point
    var prefix = 1
    var suffix = 1

    val res: IntArray = IntArray(nums.size) { 1 }

    for (i in nums.indices) {
        res[i] = prefix
        prefix *= nums[i]
    }

    for (i in nums.indices.reversed()) {
        res[i] *= suffix
        suffix *= nums[i]
    }

    return res
}