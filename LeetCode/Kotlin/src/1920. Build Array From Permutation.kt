fun buildArray(nums: IntArray): IntArray {
    val res: IntArray = IntArray(nums.size)
    for (i in nums.indices) res[i] = nums[nums[i]]
    return res
}

fun main() {
    println(buildArray(intArrayOf(0,2,1,5,3,4)).contentEquals(intArrayOf(0,1,2,4,5,3)))
    println(buildArray(intArrayOf(5,0,1,2,3,4)).contentEquals(intArrayOf(4,5,0,1,2,3)))
}