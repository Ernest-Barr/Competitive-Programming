fun increasingTriplet(nums: IntArray): Boolean {
    var i = Int.MAX_VALUE
    var j = Int.MAX_VALUE

    for (num in nums) {
        when {
            num <= i -> i = num
            num <= j -> j = num
            else -> return true
        }
    }

    return false
}