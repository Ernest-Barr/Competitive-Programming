private fun majorityElement(nums: IntArray): List<Int> {
    var c: Int = 0
    var prevC: Int = 0
    var majority: Int = 0
    var prevMajority: Int = 0
    val res: MutableList<Int> = mutableListOf()

    for (num in nums) {
        when {
            num == majority -> c++
            num == prevMajority -> prevC++

            c == 0 -> {
                majority = num
                c = 1
            }

            prevC == 0 -> {
                prevMajority = num
                prevC = 1
            }

            else -> {
                c--
                prevC--
            }
        }
    }

    c = 0
    prevC = 0
    for (num in nums) {
        when (num) {
            majority -> c++
            prevMajority -> prevC++
        }
    }

    if (c > nums.size / 3) res.add(majority)
    if (prevC > nums.size / 3) res.add(prevMajority)
    return res
}

fun main() {
    println(majorityElement(intArrayOf(3, 2, 3)).joinToString(", "))
    println(majorityElement(intArrayOf(1)).joinToString(", "))
    println(majorityElement(intArrayOf(1, 2)).joinToString(", "))
}