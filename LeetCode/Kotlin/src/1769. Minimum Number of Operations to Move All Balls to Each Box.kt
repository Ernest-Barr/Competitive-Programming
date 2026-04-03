import kotlin.math.abs

private fun minOperations(boxes: String): IntArray {
    val n = boxes.length
    val res: IntArray = IntArray(n) { 0 }

    for (i in boxes.indices) {
        for (j in boxes.indices) {
            if (boxes[j] == '1') {
                res[i] += abs(i - j)
            }
        }
    }

    return res
}
