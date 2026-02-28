private fun lemonadeChange(bills: IntArray): Boolean {
    var fives = 0
    var tens = 0

    for (num in bills) {
        when (num) {
            5 -> fives++

            10 -> {
                fives--
                tens++
            }

            20 -> {
                if (tens > 0) {
                    tens--
                    fives--
                } else {
                    fives -= 3
                }
            }
        }

        if (fives < 0) return false
        // println("Number: $num, Fives: $fives, Tens: $tens")
    }


    return true
}