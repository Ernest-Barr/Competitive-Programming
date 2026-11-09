private fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
    return arr.sorted() == target.sorted()
}
