/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    val list = mutableListOf<Int>()
    fun preorderTraversal(root: TreeNode?): List<Int> {
        if(root == null){
            return list
        }
        list.add(root.`val`)
        preorderTraversal(root?.left)
        preorderTraversal(root?.right)
        
        return list
    }
}
