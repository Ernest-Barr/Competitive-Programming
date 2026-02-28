fun validateCoupons(code: Array<String>, businessLine: Array<String>, isActive: BooleanArray): List<String> {
    val active: MutableList<Pair<String, String>> = mutableListOf()
    val res: MutableList<Pair<String, String>> = mutableListOf()
    val categories = listOf("electronics", "grocery", "pharmacy", "restaurant")

    for (i in isActive.indices) if (isActive[i]) active.add(Pair(code[i], businessLine[i]))

    for ((code, line) in active)
        if (line in categories)
            if (code.isNotEmpty() && code.all { it.isLetterOrDigit() || it == '_' })
                res.add(Pair(code, line))

    return res.sortedWith(compareBy({ it.second }, { it.first })).map { it.first }
}