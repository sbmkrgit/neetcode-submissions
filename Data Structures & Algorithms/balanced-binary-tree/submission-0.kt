/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isBalanced(root: TreeNode?): Boolean {
        return height(root) != -1
    }

    fun height(root: TreeNode?): Int {
        if(root == null){
            return 0;
        }
        
        val lh = height(root.left)
        if(lh == -1) return -1
        val rh = height(root.right)
        if(rh == -1) return -1

        if(maxOf(lh,rh) - minOf(lh, rh) > 1){
            return -1
        }

        return maxOf(lh, rh) + 1
    }
}
