fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    arr.sort()
    val diff = arr[1] - arr[0]

    for (i in arr.indices) if (i > 0 && arr[i] - arr[i - 1] != diff) return false

    return true
}