private fun getCommonOneLiner(nums1: IntArray, nums2: IntArray): Int =
    nums1.intersect(nums2.toSet()).minOrNull() ?: -1

fun getCommon(nums1: IntArray, nums2: IntArray): Int {
    val n = nums1.size
    val m = nums2.size

    var i = 0
    var j = 0

    while (i < n && j < m) {
        when {
            nums1[i] == nums2[j] -> return nums1[i]
            nums1[i] < nums2[j] -> i++
            else -> j++
        }
    }

    return -1
}
