fun hasAllCodes(s: String, k: Int): Boolean {
    val set: MutableSet<String> = mutableSetOf()

    for (i in 0..s.length - k) set.add(s.substring(i, i + k))

    return set.size == 1 shl k
}