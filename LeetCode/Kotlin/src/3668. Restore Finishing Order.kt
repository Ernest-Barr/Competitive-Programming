private fun recoverOrder(order: IntArray, friends: IntArray): IntArray {
    val set = friends.toSet()
    val res: MutableList<Int> = mutableListOf()

    for ((i, num) in order.withIndex()) {
        if (num in set) res.add(num)
    }

    return res.toIntArray()
}
