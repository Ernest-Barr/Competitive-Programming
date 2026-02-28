private fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val n = nums1.size
    val m = nums2.size
    val totalSize = n + m
    val medIdx = totalSize / 2

    var l = 0
    var r = 0

    var med = 0
    var prev = 0

    while ((l + r) <= medIdx) {
        prev = med
        if (l != n && r != m) {
            if (nums1[l] < nums2[r]) {
                med = nums1[l]
                l++
            } else {
                med = nums2[r]
                r++
            }
        } else if (l < n) {
            med = nums1[l]
            l++
        } else {
            med = nums2[r]
            r++
        }
    }

    return if (totalSize % 2 != 0) med.toDouble() else (med + prev) / 2.0
}