import java.util.PriorityQueue

private class SmallestInfiniteSet() {

    val heap: PriorityQueue<Int> = PriorityQueue()
    val set: MutableSet<Int> = mutableSetOf()

    var curr = 1

    fun popSmallest(): Int {
        if (heap.isNotEmpty()) {
            val front = heap.poll()
            set.remove(front)

            return front
        }

        return curr++
    }

    fun addBack(num: Int) {
        if (num !in set && num < curr) {
            set.add(num)
            heap.offer(num)
        }
    }

}