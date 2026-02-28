import DataStructure.TreeNode

fun twoSumBSTs(root1: TreeNode?, root2: TreeNode?, target: Int): Boolean {
    val set: MutableSet<Int> = mutableSetOf()

    fun buildSet(root: TreeNode?){
        if (root == null) return
        buildSet(root.left)
        set.add(root.`val`)
        buildSet(root.right)
    }

    buildSet(root1)

    var res = false

    fun inOrder(root: TreeNode?) {
        if (root == null) return

        inOrder(root.left)
        if (target - root.`val` in set) res = true
        inOrder(root.right)
    }

    inOrder(root2)

    return res
}