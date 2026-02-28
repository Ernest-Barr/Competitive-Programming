fun wallsAndGates(rooms: Array<IntArray>): Unit {

    val n = rooms.size
    val m = rooms[0].size
    val queue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()

    for (r in rooms.indices) {
        for (c in rooms[r].indices) {
            if (rooms[r][c] == 0) queue.addLast(Pair(r,c))
        }
    }

    var depth = 1

    while(queue.isNotEmpty()) {
        for (i in 0..<queue.size) {
            val front = queue.removeFirst()

            val adj: Array<Pair<Int,Int>> = arrayOf(
                Pair(front.first + 1, front.second),
                Pair(front.first - 1, front.second),
                Pair(front.first, front.second + 1),
                Pair(front.first, front.second - 1)
            )

            for (v in adj) {
                val i = v.first
                val j = v.second

                if (i !in 0..<n || j !in 0..<m || rooms[i][j] <= 0 || rooms[i][j] <= depth) continue

                rooms[i][j] = minOf(rooms[i][j], depth)
                queue.addLast(v)
            }
        }
        depth++
    }
}