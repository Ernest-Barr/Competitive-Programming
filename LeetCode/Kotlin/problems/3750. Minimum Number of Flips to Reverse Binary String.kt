fun minimumFlips(n: Int): Int {

    var original = n.toString(2)
    val reversed = original.reversed()

    var res = 0

    for (i in original.indices) {
        if (original[i] != reversed[i]) res++
    }

    return res
}