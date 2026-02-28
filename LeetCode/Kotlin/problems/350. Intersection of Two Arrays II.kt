import java.util.TreeSet

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    return nums1.intersect(nums2.toSet()).toIntArray()
}