private fun longestCommonPrefix(arr1: IntArray, arr2: IntArray): Int {
    val set: MutableSet<String> = mutableSetOf()
    var res = 0

    for (num in arr1) {
        val str = num.toString()
        var prefix: String = ""

        for (c in str) {
            prefix += c
            set.add(prefix)
        }
    }

    for (num in arr2) {
        val str = num.toString()
        var prefix: String = ""

        for (c in str) {
            prefix += c
            if (prefix in set) res = maxOf(prefix.length, res)
        }
    }

    return res
}