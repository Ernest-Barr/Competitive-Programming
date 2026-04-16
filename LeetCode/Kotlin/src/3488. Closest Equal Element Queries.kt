import kotlin.math.abs

fun solveQueries(
    nums: IntArray,
    queries: IntArray,
): List<Int> {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    val res: MutableList<Int> = mutableListOf()
    val n = nums.size

    for (i in nums.indices) {
        if (nums[i] !in map) map[nums[i]] = mutableListOf()
        map[nums[i]]!!.add(i)
    }

    for (i in queries.indices) {
        val idx = queries[i]
        val num = nums[idx]

        res.add(
            when {
                num in map && map[num]!!.size > 1 -> {
                    // Get closest to i
                    // Map: int -> List<idx>
                    // Given a number at nums[idx] we have a map of the indices of that number
                    // Binary search map and find the location of idx to do the following:
                    // Search map and check what is to the left and right of  idx in map[num[idx]]

                    val m = map[num]!!.size
                    val k = map[num]!!.binarySearch(idx)

                    val l = map[num]!![if (k - 1 in 0..<m) k - 1 else m - 1]
                    val r = map[num]!![if (k + 1 in 0..<m) k + 1 else 0]

                    val ldist = minOf(abs(idx - l), n - abs(idx - l))
                    val rdist = minOf(abs(idx - r), n - abs(idx - r))

                    minOf(ldist, rdist)
                }

                else -> {
                    -1
                }
            },
        )
    }

    return res
}
