private fun optimalDivision(nums: IntArray): String {
    val n = nums.size

    return when (n) {
        1 -> "${nums[0]}"
        2 -> "${nums[0]}/${nums[1]}"
        else -> {
            val res: StringBuilder = StringBuilder("${nums[0]}/(")

            for (i in 1..<n) res.append("${nums[i]}/")
            res[res.length - 1] = ')'

            res.toString()
        }
    }
}
