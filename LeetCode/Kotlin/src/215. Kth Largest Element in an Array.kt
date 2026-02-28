import java.util.*
fun findKthLargest(nums: IntArray, k: Int): Int {
    val pq = PriorityQueue<Int>(compareBy{it})
    for (num in nums) pq.offer(num)
    for (i in 0..<nums.size - k) pq.poll()
    return pq.peek()
}