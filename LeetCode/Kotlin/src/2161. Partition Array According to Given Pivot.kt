private fun pivotArray(nums: IntArray, pivot: Int): IntArray {
    val less: MutableList<Int> = mutableListOf()
    val greater: MutableList<Int> = mutableListOf()
    val equal: MutableList<Int> = mutableListOf()

    for (num in nums) {
        when {
            num < pivot -> less.add(num)
            num > pivot -> greater.add(num)
            else -> equal.add(num)
        }
    }

    return (less + equal + greater).toIntArray()
}
