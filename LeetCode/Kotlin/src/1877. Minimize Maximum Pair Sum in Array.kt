fun minPairSum(nums: IntArray): Int {
    nums.sort()
    var res = 0
    val n = nums.size
    var l = 0
    var r = n - 1


    while (l < r) {
        res = maxOf(res, nums[l++] + nums[r--])
    }

    return res
}