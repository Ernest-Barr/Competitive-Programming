private fun countCompleteSubarrays(nums: IntArray): Int {

    val uniqueNumbers: Int = nums.distinct().size
    var res = 0
    for (i in nums.indices) {
        val set: MutableSet<Int> = mutableSetOf()
        for (j in i..<nums.size) {
            set.add(nums[j])
            if (set.size == uniqueNumbers) res++
        }

    }

    return res
}

fun main() {
    println(countCompleteSubarrays(intArrayOf(1, 3, 1, 2, 2)) == 4)
    println(countCompleteSubarrays(intArrayOf(5, 5, 5, 5)) == 10)
}