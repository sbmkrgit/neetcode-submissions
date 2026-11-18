/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun postorderTraversal(root: TreeNode?): List<Int> {
        val res = mutableListOf<Int>()
        fun postOrder(node: TreeNode?) {
            if(node == null){
                return
            }
            postOrder(node?.left)
            postOrder(node?.right)
            res.add(node.`val`)
        }
        postOrder(root)
        return res
    }
}
