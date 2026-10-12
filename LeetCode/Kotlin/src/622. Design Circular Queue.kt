private class MyCircularQueue(val k: Int) {
    var size = 0
    var rear = 0
    var front = 0
    val arr: IntArray = IntArray(k) { -1 } //-1 indicates empty

    fun enQueue(value: Int): Boolean {
        val i = rear % k

        if (arr[i] != -1) return false

        arr[i] = value

        rear++
        size++

        // println(arr.joinToString(","))

        return true
    }

    fun deQueue(): Boolean {
        val i = front % k

        if (arr[i] == -1) return false

        arr[i] = -1
        front++
        size--

        // println(arr.joinToString(","))


        return true
    }

    fun Front(): Int {

        // println("$rear , ${rear % k}")

        return arr[front.mod(k)]
    }

    fun Rear(): Int {
        // println("$front , ${front % k}")

        return arr[(rear - 1).mod(k)]
    }

    fun isEmpty(): Boolean {
        return size == 0
    }

    fun isFull(): Boolean {
        return size == k
    }

}
