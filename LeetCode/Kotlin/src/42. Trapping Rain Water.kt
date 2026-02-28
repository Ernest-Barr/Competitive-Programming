fun trap(height: IntArray): Int {
    val n = height.size
    var l = 0
    var r = n - 1

    var res = 0
    var lh = height[l]
    var rh = height[r]

    while (l < r) {
        when {
            height[l] < height[r] -> {
                lh = maxOf(lh, height[l])
                res += lh - height[l++]
            }

            else -> {
                rh = maxOf(rh, height[r])
                res += rh - height[r--]
            }
        }
    }

    return res
}