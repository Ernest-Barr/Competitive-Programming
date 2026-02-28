class HitCounter() {
    val queue: ArrayDeque<Int> = ArrayDeque()

    fun hit(timestamp: Int) = queue.add(timestamp)

    fun getHits(timestamp: Int): Int {
        while (queue.isNotEmpty() && timestamp - queue.first() >= 300) queue.removeFirst()
        return queue.size
    }
}