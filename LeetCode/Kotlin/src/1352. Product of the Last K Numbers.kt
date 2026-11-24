private class ProductOfNumbers() {
    val nums: MutableList<Int> = mutableListOf()

    fun add(num: Int) {
        nums.add(num)
    }

    fun getProduct(k: Int): Int {
        return nums.takeLast(k).fold(1) { acc, it -> acc * it }
    }

}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * var obj = ProductOfNumbers()
 * obj.add(num)
 * var param_2 = obj.getProduct(k)
 */
