/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if(root == null || p == null || q == null){
            return null
        }

        if(p.`val` > root.`val` && q.`val` > root.`val`){
            return lowestCommonAncestor(root.right, p, q)
        }

        if(p.`val` < root.`val` && q.`val` < root.`val`){
            return lowestCommonAncestor(root.left, p, q)
        }

        return root
    }
}
