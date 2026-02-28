private fun longestConsecutive(nums: IntArray): Int {
    return when (nums.size) {
        0 -> 0
        else -> {
            val set = nums.toSet()
            var res = 1

            for (num in set) {
                if (num - 1 in set) continue

                var length = 1
                while (num + length in set) length++
                res = maxOf(res, length)
            }

            return res
        }
    }
}

