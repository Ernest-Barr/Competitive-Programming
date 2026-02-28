import DataStructure.TreeNode
import java.util.Stack

fun sumRootToLeafBF(root: TreeNode?): Int {
  var res = 0

  val stack: Stack<Pair<TreeNode?, String>> = Stack()

  stack.push(Pair(root, ""))
  while (stack.isNotEmpty()) {
    val (node, str) = stack.pop()

    if (node == null) continue

    val curr = str + node.`val`

    if (node.left == null && node.right == null) {
      res += curr.toInt(2)
    }

    stack.push(Pair(node.left, curr))
    stack.push(Pair(node.right, curr))
  }

  return res
}

fun sumRootToLeaf(root: TreeNode?): Int {
  var res = 0
  val stack: Stack<Pair<TreeNode?, Int>> = Stack()
  stack.push(Pair(root, 0))

  while (stack.isNotEmpty()) {
    val (node, num) = stack.pop()

    if (node == null) continue

    val curr = (num shl 1) or node.`val`

    if (node.left == null && node.right == null) res += curr

    stack.push(Pair(node.left, curr))
    stack.push(Pair(node.right, curr))
  }

  return res
}
