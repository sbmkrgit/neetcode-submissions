/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    val list = mutableListOf<Int>()
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if(root == null){
            return list
        }
        inorderTraversal(root.left)
        list.add(root.`val`)
        inorderTraversal(root.right)
        return list
    }
}
