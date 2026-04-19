private fun maxDistance(
    nums1: IntArray,
    nums2: IntArray,
): Int {
    val n = nums1.size
    val m = nums2.size

    var res = 0
    var i = 0
    var j = 0

    while (i < n && j < m) {
        if (nums1[i] > nums2[j]) i++

        res = maxOf(res, j++ - i)
    }

    return res
}
