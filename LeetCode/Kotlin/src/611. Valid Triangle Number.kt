private fun triangleNumber(nums: IntArray): Int {
    // Sum of two sides has to be longer than third
    // AB + AC > BC
    nums.sort()
    var res = 0

    for (i in (nums.size - 1) downTo 0) {
        var l = 0
        var r = i - 1

        while (l < r) {
            if (nums[l] + nums[r] > nums[i]) {
                res += r - l
                r--
            } else {
                l++
            }
        }
    }

    return res
}