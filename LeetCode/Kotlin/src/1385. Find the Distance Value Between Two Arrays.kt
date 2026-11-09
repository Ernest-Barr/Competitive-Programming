import kotlin.math.abs

private fun findTheDistanceValue(arr1: IntArray, arr2: IntArray, d: Int): Int {
    var res = 0

    for (num in arr1) {
        var flag = true
        for (num2 in arr2) {
            if (abs(num - num2) <= d) {
                flag = false
                break
            }
        }

        if (flag) res++
    }

    return res
}
