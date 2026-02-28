fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var c = 0

    for (i in flowerbed.indices) {
        if (c == n) break

        if (flowerbed[i] != 1) {
            when {
                i > 0 && i < flowerbed.size - 1 -> {
                    if (flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                        flowerbed[i] = 1
                        c++
                    }
                }

                i == 0 && i < flowerbed.size - 1 -> {
                    if (flowerbed[i + 1] != 1) {
                        flowerbed[i] = 1
                        c++
                    }
                }

                i == flowerbed.size - 1 && i > 0 -> {
                    if (flowerbed[i - 1] != 1) {
                        flowerbed[i] = 1
                        c++
                    }
                }

                i == 0 -> {
                    c++
                    flowerbed[i] = 1
                }
            }
        }
    }

    return c == n
}