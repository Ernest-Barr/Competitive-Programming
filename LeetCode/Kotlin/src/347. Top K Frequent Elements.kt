import java.util.*

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val heap: PriorityQueue<Pair<Int, Int>> = PriorityQueue(compareByDescending { it.second })
    val map: MutableMap<Int, Int> = mutableMapOf()
    val res = IntArray(k) { 0 }

    for (num in nums) map[num] = if (num in map) map[num]!! + 1 else 1
    for ((num, freq) in map) heap.offer(Pair(num, freq))
    for (i in res.indices) res[i] = heap.poll().first

    return res
}