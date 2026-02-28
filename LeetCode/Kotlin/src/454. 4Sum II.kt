private fun fourSumCount(nums1: IntArray, nums2: IntArray, nums3: IntArray, nums4: IntArray): Int {
    val map: MutableMap<Int, Int> = mutableMapOf()
    var res = 0

    for (i in nums1.indices) {
        for (j in nums2.indices) {
            val sum = nums1[i] + nums2[j]
            map[sum] = if (map[sum] == null) 1 else map[sum]!! + 1
        }
    }

    for (i in nums3.indices) {
        for (j in nums4.indices) {
            val sum = -nums3[i] - nums4[j]
            if (sum in map) res += map[sum]!!
        }
    }

    return res
}

fun main() {

}