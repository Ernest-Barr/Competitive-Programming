class MRUQueue(
    val n: Int,
) {
    val arr: MutableList<Int> = mutableListOf()

    init {
        for (i in 1..n) arr.add(i)
    }

    fun fetch(k: Int): Int {
        val num = arr.removeAt(k - 1)
        arr.add(num)
        return num
    }
}
