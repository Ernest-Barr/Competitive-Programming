import kotlin.math.abs

/**
Operation 1: Swap any two indices within same array (cost = 0)
Operation 2: Swap any two indices between the arrays (cost = 1)

Observations:

Operation 1 allows us to sort both array free of charge O(2 * n log n) = O(n log n)

Frequency of all elements must be divislble by 2, can be determined in linear time, else return -1

Sort might be problematic

 **/
fun minCost(
    nums1: IntArray,
    nums2: IntArray,
): Int {
    // nums1.sort()
    // nums2.sort()
    val map1: MutableMap<Int, Int> = mutableMapOf()
    val map2: MutableMap<Int, Int> = mutableMapOf()

    val total: MutableMap<Int, Int> = mutableMapOf()

    var res = 0
    val n = nums1.size

    for (i in 0..<n) {
        val num1 = nums1[i]
        val num2 = nums2[i]

        map1[num1] = if (num1 in map1) map1[num1]!! + 1 else 1
        map2[num2] = if (num2 in map2) map2[num2]!! + 1 else 1

        total[num1] = if (num1 in total) total[num1]!! + 1 else 1
        total[num2] = if (num2 in total) total[num2]!! + 1 else 1
    }

    // println(total)
    // println(map1)
    // println(map2)
    // // println()
    // for ((key, freq) in total) {

    //     if (key in map1 && key in map2) {
    //         if (map1[key]!! == map2[key]!!) {
    //             map1.remove(key)
    //             map2.remove(key)
    //         }
    //     }
    // }

    /**
     Calculate total difference between elements and divide by 2
     **/

    // val swaps: MutableList<Pair<Int, Int>> = mutableListOf()

    for ((key, freq) in total) {
        if (freq % 2 != 0) return -1

        val target = freq / 2
        val freq1 = map1[key] ?: 0

        // Sum up the absolute differences
        res += abs(freq1 - target)
    }

    // println(swaps)

    // println(map1)
    // println(map2)

    return res / 2
}
