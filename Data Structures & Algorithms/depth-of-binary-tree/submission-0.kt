/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if(root == null){
            return 0
        }
        val lh = maxDepth(root.left)
        val rh = maxDepth(root.right)
        return maxOf(lh,rh) + 1
    }
}
