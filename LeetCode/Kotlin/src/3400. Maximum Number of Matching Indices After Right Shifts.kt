private fun maximumMatchingIndices(nums1: IntArray, nums2: IntArray): Int {
    val n = nums1.size
    var res = 0

    for (i in 0..<n) {
        var c = 0
        for (j in 0..<n) if (nums1[(j + i) % n] == nums2[j]) c++
        res = maxOf(res, c)
    }

    return res
}
