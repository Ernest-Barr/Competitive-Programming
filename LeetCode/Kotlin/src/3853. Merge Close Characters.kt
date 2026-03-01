fun mergeCharacters(
    s: String,
    k: Int,
): String {
    val list: MutableList<Char> = mutableListOf()

    for (c in s) {
        val window = list.takeLast(k)

        if (c in window) continue else list.add(c)
    }

    return list.joinToString("")
}
