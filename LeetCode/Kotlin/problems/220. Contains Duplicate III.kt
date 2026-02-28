import java.util.TreeSet
import kotlin.math.abs

fun containsNearbyAlmostDuplicate(nums: IntArray, indexDiff: Int, valueDiff: Int): Boolean {
    val set: TreeSet<Int> = TreeSet()
    fun check(i: Int, j: Int?): Boolean = j != null && abs( i - j) <= valueDiff

    for (i in nums.indices) {
        if (check(nums[i], set.ceiling(nums[i])) || check (nums[i], set.floor(nums[i]))) return true

        set.add(nums[i])
        if (set.size > indexDiff) set.remove(nums[i - indexDiff])
    }

    return false
}