private fun spiralOrder(matrix: Array<IntArray>): List<Int> {
    val n = matrix.size - 1
    val m = matrix[0].size - 1

    var top = 0
    var bottom = n
    var left = 0
    var right = m

    val res: MutableList<Int> = mutableListOf()

    var case = "RIGHT"

    while (top <= bottom && left <= right) when(case) {
        "RIGHT" -> {
            val r = top
            var c = left

            while (c <= right) res.add(matrix[r][c++])

            top++
            case = "DOWN"
        }

        "DOWN" -> {
            var r = top
            val c = right

            while (r <= bottom) res.add(matrix[r++][c])

            right--
            case = "LEFT"
        }

        "LEFT" -> {
            val r = bottom
            var c = right

            while (c >= left) res.add(matrix[r][c--])

            bottom--
            case = "UP"
        }

        "UP" -> {
            var r = bottom
            val c = left

            while (r >= top) res.add(matrix[r--][c])

            left++
            case = "RIGHT"
        }
    }

    return res
}