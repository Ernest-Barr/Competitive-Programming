import java.util.Stack

fun canVisitAllRooms(rooms: List<List<Int>>): Boolean {
    val stack: Stack<Int> = Stack()
    val visited: BooleanArray = BooleanArray(rooms.size) { false }

    stack.push(0)
    visited[0] = true

    while (stack.isNotEmpty()) {
        val u = stack.pop()

        for (v in rooms[u]) {
            if (visited[v]) continue

            visited[v] = true
            stack.add(v)
        }
    }

    return visited.all { it }
}