import kotlin.math.abs

private fun reverse(x: Int): Int {
  var num: Int = abs(x)
  var result: Int = 0

  while (num > 0) {
    result *= 10
    result += num % 10
    num /= 10
  }

  if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) return 0

  return if (x < 0) -result else result
}
