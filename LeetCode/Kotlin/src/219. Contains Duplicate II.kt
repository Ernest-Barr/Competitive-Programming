import kotlin.math.abs

private fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val map: MutableMap<Int, Int> = mutableMapOf()

    for (i in nums.indices) {
        if (map.contains(nums[i]) && abs(map.getValue(nums[i]) - i) <= k) return true
        map[nums[i]] = i
    }
    return false
}

fun main() {
    println(containsNearbyDuplicate(intArrayOf(1,2,3,1), 3))
    println(containsNearbyDuplicate(intArrayOf(1,0,1,1), 1))
    println(containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3), 2))
}