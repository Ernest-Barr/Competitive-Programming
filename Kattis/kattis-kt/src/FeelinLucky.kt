import java.util.*
import kotlin.math.*
import java.io.*


fun main() {
    val sc = Scanner(System.`in`)
    // n m
    // I C P C
    val arr = Array(4) { BooleanArray (3) { false } }
    var i = 0

    repeat(4) {
        for (c in sc.nextLine()) {
            when (c) {
                'I' -> arr[i][0] = true
                'C' -> arr[i][1] = true
                'P' -> arr[i][2] = true
            }
        }

        i++
    }

    var flag = false
    val perms = mutableListOf<List<Int>>()
    val nums = listOf(1,2,3,4)
    val used = BooleanArray(4) { false }

    fun permute(curr: MutableList<Int>) {
        if (curr.size == 4) {
            perms.add(curr.toList())
            return
        }
        for ((j, element) in nums.withIndex()) {
            if (!used[j]) {
                curr.add(element)
                used[j] = true
                permute(curr)
                curr.removeLast()
                used[j] = false
            }
        }
    }

    permute(mutableListOf())

    //    println(perms.size)
    fun dfs(perm: List<Int>, curr: StringBuilder, i: Int, ) {
        if (flag) return
        if (curr.length == 4) {
            if (curr.toString() == "ICPC") flag = true
            return
        }

        /**
         *  4! * 2^3
         */

        for (j in i..<perm.size) {
            val bools = arr[perm[j] - 1]
            for (k in 0..<3) {
                if (!bools[k]) continue
                val c = when(k) {
                    0 -> "I"
                    1  -> "C"
                    else  -> "P"
                }

                curr.append(c)
                dfs(perm ,curr , j + 1)
                curr.setLength(curr.length - 1)
            }
        }

    }

    for (perm in perms) {
        if (flag) break
        dfs(perm, StringBuilder(), 0)
    }



//    for (bools in arr) println(bools.joinToString())

    println(if (flag) 1 else 0)
}
