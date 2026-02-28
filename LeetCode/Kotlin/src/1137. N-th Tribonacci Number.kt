private fun tribonacci(n: Int): Int {
    val arr: IntArray = IntArray(38) {1}
    arr[0] = 0

    for (i in 0..<(arr.size - 3)) {
        arr[i + 3] = arr[i] + arr[i + 1] + arr[i + 2]
    }

    return arr[n]
}