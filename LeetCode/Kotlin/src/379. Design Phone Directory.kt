class PhoneDirectory(
    val maxNumbers: Int,
) {
    val arr: BooleanArray = BooleanArray(maxNumbers) { false }

    fun get(): Int {
        for (i in arr.indices) {
            if (arr[i] == false) {
                arr[i] = true
                return i
            }
        }

        return -1
    }

    fun check(number: Int): Boolean = !arr[number]

    fun release(number: Int) {
        arr[number] = false
    }
}
