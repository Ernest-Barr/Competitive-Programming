fun hasAlternatingBits(n: Int): Boolean {
    val s = n.toString(2)

    for (i in 1..<s.length) if (s[i - 1] == s[i]) return false

    return true
}

// Alternate method, divide by 2 and check remainder.