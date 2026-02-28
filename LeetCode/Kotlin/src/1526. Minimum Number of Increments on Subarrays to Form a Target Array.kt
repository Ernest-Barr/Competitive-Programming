private fun minNumberOperations(target: IntArray): Int {
    var res = target[0]

    for (i in 1..<target.size) {
        if (target[i] > target[i - 1]) res += target[i] - target[i - 1]
    }

    return res
}