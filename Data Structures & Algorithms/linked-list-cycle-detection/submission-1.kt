/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        val seen = HashSet<ListNode>()
        var ptr = head
        while(ptr != null){
            if(seen.contains(ptr)){
                return true
            }
            seen.add(ptr)
            ptr = ptr.next
        }
        return false
    }
}
