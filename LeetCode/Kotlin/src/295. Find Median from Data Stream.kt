import java.util.PriorityQueue

class MedianFinder() {
    val min: PriorityQueue<Int> = PriorityQueue()
    val max: PriorityQueue<Int> = PriorityQueue(compareByDescending { it })

    fun addNum(num: Int) {
        max.offer(num)
        min.offer(max.poll())

        if (min.size > max.size) max.offer(min.poll())
    }

    fun findMedian(): Double {
        return when {
            min.size == max.size -> (min.peek() + max.peek()) / 2.0
            min.size > max.size -> min.peek().toDouble()
            else -> max.peek().toDouble()
        }
    }

}