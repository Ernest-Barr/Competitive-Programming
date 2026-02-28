private fun generateMatrix(n: Int): Array<IntArray> {
    val res: Array<IntArray> = Array(n) { IntArray(n) { 0 } }

    var top = 0
    var bottom = n - 1
    var left = 0
    var right = n - 1
    var case = "RIGHT"

    var curr = 1
    while (top < bottom && left < right) {
        when (case) {
            "RIGHT" -> {
                val r = top
                var c = left
                while (c <= right) res[r][c++] = curr++
                left++
                case = "DOWN"
            }

            "DOWN" -> {
                var r = top
                val c = right

                while (r <= bottom) res[r++][c] = curr++
                top++
                case = "LEFT"
            }

            "LEFT" -> {
                val r = bottom
                var c = right

                while (c >= left) res[r][c--] = curr++
                right--
                case = "UP"
            }

            "UP" -> {
                var r = bottom
                val c = left

                while (r >= top) res[r--][c] = curr++
                bottom--
                case = "RIGHT"
            }
        }

    }

    return res
}