import java.util.Stack

fun killProcess(
    pid: List<Int>,
    ppid: List<Int>,
    kill: Int,
): List<Int> {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    var res: MutableList<Int> = mutableListOf()
    val n = pid.size

    for (i in 0..<n) map[pid[i]] = mutableListOf()
    for (i in 0..<n) if (ppid[i] != 0) map[ppid[i]]!!.add(pid[i])

    // println(map)

    // DFS starting from kill, add kill + nodes in kill

    val stack: Stack<Int> = Stack()
    res.add(kill)
    stack.push(kill)

    while (stack.isNotEmpty()) {
        for (v in map[stack.pop()]!!) {
            res.add(v)
            stack.push(v)
        }
    }

    return res
}
