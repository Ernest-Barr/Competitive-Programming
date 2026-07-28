private fun arrayRankTransform(arr: IntArray): IntArray {
    var rank = 1
    val map: MutableMap<Int, Int> = mutableMapOf()
    val nums = arr.sorted().distinct()

    for (num in nums) map[num] = rank++
    for (i in arr.indices) arr[i] = map[arr[i]]!!

    return arr
}
