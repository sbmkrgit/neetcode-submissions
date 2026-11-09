/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        val dummyNode: ListNode? = ListNode(0)
        dummyNode?.next = head
        var groupPrev = dummyNode
        while(true){
            var kthNode = groupPrev
            for(i in 0 until k){
                kthNode = kthNode?.next
                if(kthNode == null){
                    return dummyNode?.next
                }
            }

            val groupNext = kthNode?.next

            var prev = groupNext
            var curr = groupPrev?.next
            while(curr != groupNext){
                val temp = curr?.next
                curr?.next = prev
                prev = curr
                curr = temp
            }
            val temp = groupPrev?.next
            groupPrev?.next = kthNode
            groupPrev = temp
        }
    }
}
