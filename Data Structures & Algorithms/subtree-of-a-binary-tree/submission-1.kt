/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(root == null || subRoot == null){
            return root == subRoot
        }
        if(isSameTree(root, subRoot)){
            return true
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)
    }

    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p == null || q == null){
            return p == q
        }

        return p.`val` == q.`val` && isSameTree(p.left, q.left) &&
            isSameTree(p.right, q.right)
    }
}
