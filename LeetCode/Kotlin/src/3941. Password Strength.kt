fun passwordStrength(password: String): Int {
    val set: MutableSet<Char> = mutableSetOf()
    var res = 0

    for (c in password) {
        if (c !in set) {
            res += when (c) {
                in 'a'..'z' -> 1
                in 'A'..'Z' -> 2
                in '0'..'9' -> 3
                else -> 5
            }

            set.add(c)
        }
    }

    return res
}
