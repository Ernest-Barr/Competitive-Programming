class RecentCounter() {
    val queue: ArrayDeque<Int> = ArrayDeque()

    fun ping(t: Int): Int {
        queue.addLast(t)

        while (queue.isNotEmpty() && queue.first() !in  (t - 3000)..t) queue.removeFirst()

        return queue.size
    }

}