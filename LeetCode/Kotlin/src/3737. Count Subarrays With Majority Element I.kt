fun countMajoritySubarrays(
    nums: IntArray,
    target: Int,
): Int {
    var res = 0

    for (i in 0..<nums.size) {
        var c = 0
        for (j in i..<nums.size) {
            when (nums[j]) {
                target -> c++
                else -> c--
            }
            if (c > 0) res++
        }
    }

    return res
}
