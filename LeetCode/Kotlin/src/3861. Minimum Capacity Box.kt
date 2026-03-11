fun minimumIndex(
    capacity: IntArray,
    itemSize: Int,
): Int {
    var minCap = Int.MAX_VALUE
    var res = capacity.size + 1

    for (i in capacity.indices) {
        if (capacity[i] >= itemSize) {
            if (capacity[i] < minCap) {
                res = i
                minCap = capacity[i]
            }
        }
    }

    return if (res == capacity.size + 1) -1 else res
}
