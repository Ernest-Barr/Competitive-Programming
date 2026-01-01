class NumArray(val nums: IntArray) {
    val n = nums.size
    val pre: IntArray = IntArray(n) { 0 }

    init {
        pre[0] = nums[0]
        for (i in 1..<n) pre[i] = pre[i - 1] + nums[i]
        // println(pre.joinToString(","))
    }

    fun sumRange(left: Int, right: Int): Int = when (left) {
        0 -> pre[right]
        else -> pre[right] - pre[left - 1]
    }

}