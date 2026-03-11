fun minOperations(s: String): Int {
    // Greedily select n - 1 charachters in sliding window
    val n = s.length
    val sorted = s.toCharArray().sorted().joinToString("")
    // edc
    // cde

    // fedc
    // cdef

    // srrp
    // prrs

    val first =
        s
            .substring(0, n - 1)
            .toCharArray()
            .sorted()
            .joinToString("") + s[n - 1]
    val second =
        s[0] +
            s
                .substring(1, n)
                .toCharArray()
                .sorted()
                .joinToString("")

    // println(first)
    // println(second)
    // println(sorted)
    return when {
        s == sorted -> {
            0
        }

        n < 3 -> {
            -1
        }

        first == sorted || second == sorted -> {
            1
        }

        s[0] == sorted[n - 1] && s[n - 1] == sorted[0] -> {
            if (first[0] != sorted[0] && second[n - 1] != sorted[n - 1]) 3 else 2
        }

        else -> {
            2
        }
    }
}
