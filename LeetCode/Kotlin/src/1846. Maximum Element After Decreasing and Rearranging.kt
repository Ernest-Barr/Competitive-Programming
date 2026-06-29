private fun maximumElementAfterDecrementingAndRearranging(nums: IntArray): Int {
    /***

    First element has to be 1
    Second element has to either be either 1 or 2

    Following the second element, the elements have to either be monotonically increasing in order to get a higher maximum value, or they have to be equal to the element.
    - Can also be one less since we are dealing with absolute values.


    Tbhere is no cost associated with operations, DP is not necessary


    Since we want our array to be increasing, we can sort
     */

    nums.sort()
    val n = nums.size
    var res = 1

    if (nums[0] != 1) nums[0] = 1

    for (i in 1..<n) {
        if (nums[i] - nums[i - 1] > 1) nums[i] = nums[i - 1] + 1
        res = maxOf(res, nums[i])
    }

    return res
}
