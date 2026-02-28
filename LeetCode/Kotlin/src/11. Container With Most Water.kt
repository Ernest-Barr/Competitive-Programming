private fun maxArea(height: IntArray): Int {
    var l = 0
    var r = height.size - 1
    var maxArea = 0

    while (l < r) {
        val minHeight = minOf(height[l], height[r])
        if (minHeight * (r - l) > maxArea) {
            maxArea = minHeight * (r - l)
        }

        if (height[l] < height[r]) {
            l++
        } else {
            r--
        }

    }

    return maxArea
}