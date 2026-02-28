package util

import kotlin.random.Random

fun randomIntArray(n: Int, lower: Int, upper: Int): IntArray {
    return IntArray(n) { Random.nextInt(lower, upper + 1) }
}

