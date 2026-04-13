import kotlin.math.abs

fun getStrongest(
    arr: IntArray,
    k: Int,
): IntArray {
    arr.sort()

    val n = arr.size
    val m = arr[(n - 1) / 2]

    val sorted =
        arr.sortedWith(
            Comparator { i, j ->
                val a = abs(i - m)
                val b = abs(j - m)

                when {
                    a == b -> i.compareTo(j)
                    else -> a.compareTo(b)
                }
            },
        )

    return sorted.takeLast(k).toIntArray()
}
