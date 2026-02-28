import kotlin.math.*
fun accountBalanceAfterPurchase(purchaseAmount: Int): Int {
    return 100 - (floor((purchaseAmount + 5 ) / 10.0) * 10).toInt()
    }