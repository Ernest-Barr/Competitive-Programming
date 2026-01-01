fun maximumHappinessSum(happiness: IntArray, k: Int): Long {
    happiness.sort()
    var res = 0L
    var i = happiness.size - 1
    var j = 0

    repeat(k) {
        val child = happiness[i--] - j++
        res += if (child <= 0) 0 else child
    }

    return res
}