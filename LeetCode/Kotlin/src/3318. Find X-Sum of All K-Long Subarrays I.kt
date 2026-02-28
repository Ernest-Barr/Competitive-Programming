import java.util.PriorityQueue

private fun findXSum(nums: IntArray, k: Int, x: Int): IntArray {
    val n = nums.size

    val map: MutableMap<Int, Int> = mutableMapOf()
    val heap: PriorityQueue<Pair<Int, Int>> =
        PriorityQueue(compareByDescending<Pair<Int, Int>> { it.second }.thenByDescending { it.first })

    val res: IntArray = IntArray(n - k + 1) { 0 }

    fun solve(l: Int, r: Int): Int {
        map.clear()
        heap.clear()

        var sum = 0
        for (i in l..r) map[nums[i]] = if (nums[i] in map) map[nums[i]]!! + 1 else 1

        for ((num, freq) in map) heap.offer(Pair(num, freq))

        repeat(x) {
            if (heap.isNotEmpty()) {
                val num = heap.poll()
                sum += num.first * num.second
            }
        }

        return sum
    }

    for (i in 0..n - k) res[i] = solve(i, i + k - 1)

    return res
}