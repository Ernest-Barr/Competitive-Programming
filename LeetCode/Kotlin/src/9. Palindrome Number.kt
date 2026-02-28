fun isPalindrome(x: Int): Boolean {
    if (x < 0) return false

    var reversed = 0
    var num = x

    while (num != 0) {
        reversed *= 10
        reversed += num % 10
        num /= 10
    }

    return reversed == x
}