class MovingAverage(var size: Int) {

    var sum = 0
    val queue: ArrayDeque<Int> = ArrayDeque()

    fun next(num: Int): Double {
        sum += num
        queue.addLast(num)

        if (queue.size > size) sum -= queue.removeFirst()

        return sum.toDouble() / queue.size
    }
}