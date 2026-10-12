private fun evaluate(s: String, knowledge: List<List<String>>): String {
    val map: MutableMap<String, String> = mutableMapOf()
    val res = StringBuilder()
    val key = StringBuilder()
    var flag = false

    for ((key, value) in knowledge) map[key] = value

    for (c in s) {
        when {
            c == '(' -> flag = true
            c == ')' -> {
                val str = key.toString()
                flag = false
                res.append(map[str] ?: '?')
                key.setLength(0)
            }

            flag -> key.append(c)
            else -> res.append(c)
        }
    }

    return res.toString()
}
