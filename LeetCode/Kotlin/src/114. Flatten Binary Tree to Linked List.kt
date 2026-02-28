import DataStructure.TreeNode

fun flattenBF(root: TreeNode?): Unit {
    val list: MutableList<Int> = mutableListOf()

    fun preorder(node: TreeNode?) {
        if (node == null) return
        list.add(node.`val`)
        preorder(node.left)
        preorder(node.right)
    }

    preorder(root)
    root?.left = null

    var prev: TreeNode? = null
    var cpy: TreeNode? = root

    for (num in list) {
        if (cpy != null)  {
            cpy.`val` = num
        } else  {
            cpy = TreeNode(num)
            prev?.right = cpy
        }
        cpy.left = null
        prev = cpy
        cpy = cpy.right
    }
}


//TODO: Follow up in O(1) space
fun flatten(root: TreeNode?): Unit {

}

