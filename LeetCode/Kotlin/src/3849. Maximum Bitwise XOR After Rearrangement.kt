//TODO: Simplify
private fun maximumXor(s: String, t: String): String {
    val n = s.length
    var ones = 0
    var zeroes = 0
    for (c in t) if (c == '0') zeroes++ else ones++

    val res = StringBuilder()

    for (i in 0..<n) {
        when {
            ones > 0 && (s[i] == '0' && t[i] == '1') -> {
                res.append('1')
                ones--
            }

            ones > 0 && s[i] == '0' && t[i] == '0' -> {
                res.append('1')
                ones--
            }

            zeroes > 0 && s[i] == '1' && t[i] == '0' -> {
                // println(2)
                res.append('1')
                zeroes--
            }

            zeroes > 0 && s[i] == '1' && t[i] == '1' -> {
                // println(3)
                res.append('1')
                zeroes--
            }

            else -> {
                var d = 0

                d = when {
                    zeroes > 0 -> (s[i] - '0') xor 0
                    else -> (s[i] - '0') xor 1
                }

                res.append(d)
            }
        }
        // println(zeroes)
        // println(ones)
        // val a = t[i] - '0'
        // val b = s[i] - '0'
    }

    return res.toString()
}
