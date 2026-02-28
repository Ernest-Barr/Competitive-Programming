//TODO: Optimize
fun getModifiedArrayBF(length: Int, updates: Array<IntArray>): IntArray {
    val res: IntArray = IntArray(length) { 0 }

    for ((start, end, inc) in updates) {
        for (i in start..end) {
            res[i] += inc
        }
    }

    return res
}

