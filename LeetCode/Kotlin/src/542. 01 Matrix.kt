fun updateMatrixBruteForce(mat: Array<IntArray>): Array<IntArray> {

    val n = mat.size
    val m = mat[0].size
    val res: Array<IntArray> = Array(n) { IntArray(m) { Int.MAX_VALUE } }
    val queue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()
    val visited: MutableSet<Pair<Int, Int>> = mutableSetOf()

    for (i in mat.indices) {
        for (j in mat[i].indices) {
            if (mat[i][j] == 0) {
                var v = Pair(i, j)
                queue.addLast(v)
                res[i][j] = 0
                visited.add(v)
            }
        }
    }

    var dist = 1

    while (queue.isNotEmpty()) {

        for (i in 0..<queue.size) {
            val front = queue.removeFirst()

            val adj: Array<Pair<Int, Int>> = arrayOf(
                Pair(front.first + 1, front.second),
                Pair(front.first - 1, front.second),
                Pair(front.first, front.second + 1),
                Pair(front.first, front.second - 1)
            )

            for (v in adj) {
                val i = v.first
                val j = v.second
                if (i !in 0..<n || j !in 0..<m || mat[i][j] == 0 || v in visited) continue

                res[i][j] = minOf(res[i][j], dist)
                queue.addLast(v)
                visited.add(v)
            }
        }

        dist++
    }


    return res
}


fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
    val n = mat.size
    val m = mat[0].size
    val res: Array<IntArray> = Array(n) { IntArray(m) }

    for (i in mat.indices) {
        for (j in mat[i].indices) {
            res[i][j] = if (mat[i][j] != 0) Int.MAX_VALUE else 0
        }
    }

    for (i in res.indices) {
        for (j in res[i].indices) {
            if (res[i][j] != 0) {
                if (i > 0) res[i][j] = minOf(res[i][j], res[i - 1][j] + 1)
                if (j > 0) res[i][j] = minOf(res[i][j], res[i][j - 1] + 1)
            }
        }
    }


    for (i in res.indices.reversed()) {
        for (j in res[i].indices.reversed()) {
            if (res[i][j] != 0) {
                if (i + 1 < n) res[i][j] = minOf(res[i][j], res[i + 1][j] + 1)
                if (j + 1 < m) res[i][j] = minOf(res[i][j], res[i][j + 1] + 1)
            }
        }
    }

    return res
}