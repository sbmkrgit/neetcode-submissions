/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var result = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        height(root)
        return result
    }

    fun height(node: TreeNode?): Int {
        if(node == null){
            return 0
        }
        val leftHeight = height(node?.left)
        val rightHeight = height(node?.right)

        result = maxOf(result, leftHeight + rightHeight)
        return 1 + maxOf(leftHeight, rightHeight)
    }
}
