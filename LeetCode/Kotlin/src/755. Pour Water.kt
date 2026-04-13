private fun pourWater(
    heights: IntArray,
    volume: Int,
    k: Int,
): IntArray {
    val n = heights.size

    repeat(volume) {
        var lowestIdx = k

        // Go left

        for (i in k - 1 downTo 0) {
            if (heights[i] > heights[lowestIdx]) {
                break
            } else if (heights[i] < heights[lowestIdx]) {
                lowestIdx = i
            }
        }

        // Go right

        if (lowestIdx == k) {
            for (i in k + 1..<n) {
                if (heights[i] > heights[lowestIdx]) {
                    break
                } else if (heights[i] < heights[lowestIdx]) {
                    lowestIdx = i
                }
            }
        }

        heights[lowestIdx]++
    }

    return heights
}
