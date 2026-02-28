private class TwoSum() {
    val list: MutableList<Int> = mutableListOf()

    fun binarySearch(num: Int): Int {
        var l = 0
        var r = list.size - 1

        while (l <= r) {
            val m =  l + (r - l) / 2
            when {
                list[m] == num -> return m
                list[m] > num -> r = m - 1
                else -> l = m + 1
            }
        }

        return l
    }

    fun add(number: Int) {
        val idx = binarySearch(number)
        list.add(idx, number)
    }

    fun find(value: Int): Boolean {
        var l = 0
        var r = list.size - 1

        while (l < r)  {
            val sum = list[l] + list[r]
            when {
                sum == value -> return true
                sum > value -> r--
                else -> l++
            }
        }

        return false
    }
}