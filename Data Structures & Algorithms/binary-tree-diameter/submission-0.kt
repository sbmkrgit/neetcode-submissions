/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    var diameter = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        height(root)
        return diameter
    }

    fun height(root: TreeNode?): Int {
        if(root == null){
            return 0
        }
        val lh = height(root.left)
        val rh = height(root.right)
        diameter = maxOf(lh+rh, diameter)
        return maxOf(lh,rh) + 1
    }
}
