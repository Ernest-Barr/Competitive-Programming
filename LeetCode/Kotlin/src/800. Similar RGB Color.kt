private fun similarRGB(color: String): String {
    // If frequency of a char is 2 is a multiple of 2 it gets compressed
    // -(AB - UV)2 - (CD - WX)2 - (EF - YZ)2

    /**
    Values are in hex

    -(AB - UV)2 - (CD - WX)2 - (EF - YZ)2

    values in the parenthesis are always positive, meaning the maximum similarity is zero

    The value we are comparing against has to have a shorthand of length 3,

    First value in a color is always #, can be ignored

    Interested in values from indices [1,6]

    Indices in the groups have to be equal to form the shorthand [1,2], [3,4], [5,6]
     */

    val c = color.substring(1)
    val map: MutableMap<Char, Int> = mutableMapOf()
    val res = StringBuilder("#")

    for (i in ('0'..'9') + ('a'..'f')) {
        map[i] = ("$i$i").hexToInt()
    }

    for (i in 0..5 step 2) {
        val value = c.substring(i, i + 2).toInt(16)

        var cand = 'a'
        var min = Int.MAX_VALUE

        for ((char, num) in map) {
            val similarity = (value - num) * (value - num)

            if (similarity < min) {
                min = similarity
                cand = char
            }
        }

        repeat(2) {
            res.append(cand)
        }
    }


    return res.toString()
}
