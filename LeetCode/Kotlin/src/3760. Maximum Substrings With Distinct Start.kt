private fun maxDistinct(s: String): Int {
    var res = 0
    val set: MutableSet<Char> = mutableSetOf()

    for (c in s) {
        if (c !in set) res++
        set.add(c)
    }

    return res
}