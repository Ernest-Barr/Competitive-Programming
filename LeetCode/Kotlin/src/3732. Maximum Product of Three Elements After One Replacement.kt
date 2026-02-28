import kotlin.math.abs

fun maxProduct(nums: IntArray): Long {
    for (i in nums.indices) nums[i] = abs(nums[i])

    nums.sort()

    val first = nums[nums.size - 1]
    val second = nums[nums.size - 2]

    return (first.toLong() * second.toLong() * 1e5.toLong())
}
