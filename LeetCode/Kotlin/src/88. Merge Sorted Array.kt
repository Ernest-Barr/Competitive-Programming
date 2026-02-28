fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var j = nums1.size - n - 1
    var k = n - 1

    for (i in nums1.indices.reversed()) {
        when {
            k < 0 -> break
            j >= 0 && nums1[j] >= nums2[k] -> nums1[i] = nums1[j--]
            else -> nums1[i] = nums2[k--]
        }
    }
}