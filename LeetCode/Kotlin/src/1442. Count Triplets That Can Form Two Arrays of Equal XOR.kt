private fun countTripletsBF(arr: IntArray): Int {
    val n = arr.size
    var res = 0

    for (i in 0..<n) {
        var first = 0

        for (j in i + 1..<n) {
            first = first xor arr[j - 1]

            var second = 0

            for (k in j..<n) {
                second = second xor arr[k]

                if (first == second) res++
            }
        }
    }

    return res
}

//TODO: Optimized solution
