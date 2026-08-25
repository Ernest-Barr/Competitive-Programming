private fun resultArray(nums: IntArray): IntArray {
    val arr1: MutableList<Int> = mutableListOf(nums[0])
    val arr2: MutableList<Int> = mutableListOf(nums[1])
    val n = nums.size

    for (i in 2..<n) {
        when {
            arr1.last() > arr2.last() -> arr1.add(nums[i])
            else -> arr2.add(nums[i])
        }
    }

    return (arr1 + arr2).toIntArray()
}
