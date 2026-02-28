private fun sortArray(nums: IntArray): IntArray {
    val sorted: IntArray = nums

    fun mergeSort(arr: IntArray) {

        fun merge(left: IntArray, right: IntArray, merged: IntArray) {
            var i = 0
            var j = 0
            var k = 0

            val n = left.size
            val m = right.size

            while (i < n && j < m) merged[k++] = if (left[i] < right[j]) left[i++] else right[j++]
            while (i < n) arr[k++] = left[i++]
            while (j < m) arr[k++] = right[j++]
        }

        if (arr.size <= 1) return

        val mid = arr.size / 2

        val leftArr = arr.copyOfRange(0, mid)
        val rightArr = arr.copyOfRange(mid, arr.size)

        mergeSort(leftArr)
        mergeSort(rightArr)

        merge(leftArr, rightArr, arr)
    }

    mergeSort(sorted)
    return sorted
}


