private fun minProductSum(nums1: IntArray, nums2: IntArray): Int {
    var res = 0
    val n = nums1.size - 1
    nums1.sort()
    nums2.sort()

    for (i in 0..n) res += nums1[i] * nums2[n - i]

    return res
}