private fun maxProduct(nums: IntArray): Int {
    var i = 0
    var j = 0

    for (num in nums) {
        if (num >= i) {
            j = i
            i = num
        } else if (num >= j) {
            j = num
        }
    }

    return (i - 1) * (j - 1)
}
