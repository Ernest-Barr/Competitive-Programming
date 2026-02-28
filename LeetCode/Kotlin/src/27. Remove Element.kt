private fun removeElement(nums: IntArray, `val`: Int): Int {

    var k = 0
    for (i in nums.indices) {
        if (nums[i] != `val`) {
            val temp = nums[k]
            nums[k] = nums[i]
            nums[i] = temp
            k++
        }
    }
    return k
}