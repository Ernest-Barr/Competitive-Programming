package util

import DataStructure.TreeNode

fun TreeNode?.print() {
    val h = this.getHeight()

}

fun TreeNode?.getHeight(): Int {
    fun helper(root: TreeNode?): Int {
        root ?: return 0
        return 1 + maxOf(helper(root.left), helper(root.right))
    }

    return helper(this)
}

fun TreeNode?.inOrder(): IntArray {
    return this?.let {
        it.left.inOrder() + intArrayOf(it.`val`) + it.right.inOrder()
    } ?: intArrayOf()
}

fun TreeNode?.preOrder(): IntArray {
    return this?.let {
        intArrayOf(it.`val`) + it.left.preOrder() + it.right.preOrder()
    } ?: intArrayOf()
}

fun TreeNode?.postOrder(): IntArray {
    return this?.let {
        it.left.postOrder() + it.right.postOrder() + intArrayOf(it.`val`)
    } ?: intArrayOf()
}

fun IntArray.toBST(): TreeNode? {
    this.sort()

    fun helper(start: Int, end: Int): TreeNode? {
        if (start > end) return null

        val m = start + (end - start) / 2
        val node = TreeNode(this[m])

        node.left = helper(start, m - 1)
        node.right = helper(m + 1, end)

        return node
    }

    return helper(0, this.size - 1)
}

fun TreeNode?.isValidBST(): Boolean {
    var prev: TreeNode? = null

    fun helper(root: TreeNode?): Boolean {
        root ?: return true

        if (!helper(root.left)) return false
        if (prev != null && prev!!.`val` >= root.`val`) return false

        prev = root

        return helper(root.right)
    }

    return helper(this)
}

fun IntArray.toBinaryTree(): TreeNode? {

    return null
}

fun randomBST(n: Int, lower: Int, upper: Int): TreeNode? {
    return randomIntArray(n, lower, upper).toBST()
}

//fun randomBT(): TreeNode {
//
//}

