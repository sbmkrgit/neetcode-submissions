/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        // val seen = HashSet<ListNode>()
        // var ptr = head
        // while(ptr != null){
        //     if(seen.contains(ptr)){
        //         return true
        //     }
        //     seen.add(ptr)
        //     ptr = ptr.next
        // }
        // return false
        var slow = head
        var fast = head?.next
        while(fast != null && fast?.next != null){
            slow = slow?.next
            fast = fast?.next?.next
            if(slow == fast){
                return true
            }
        }
        return false
    }
}
