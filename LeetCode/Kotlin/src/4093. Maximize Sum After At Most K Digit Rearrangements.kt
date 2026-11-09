import java.util.PriorityQueue
import kotlin.math.abs

private fun maximizeSum(nums: IntArray, k: Int): Long {
    val pq: PriorityQueue<Int> = PriorityQueue(compareByDescending { it })
    val list: MutableList<Pair<Int, Int>> = mutableListOf()
    val n = nums.size
    var res = 0L

    for (i in 0..<n) {
        var num = nums[i]

        while (num != 0) {
            pq.offer(num % 10)
            num /= 10
        }

        while (pq.isNotEmpty()) num = num * 10 + pq.poll()

        list.add(Pair(nums[i], num))
    }

    list.sortByDescending { abs(it.second - it.first) }

    var j = 0

    for ((num, maxed) in list) res += if (num != maxed && j++ < k) maxed else num

    return res
}
