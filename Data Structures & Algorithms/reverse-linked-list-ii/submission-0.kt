/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        val dummyNode: ListNode? = ListNode(0)
        dummyNode?.next = head
        var leftPrev = dummyNode
        var curr: ListNode? = head
        repeat(left - 1){
            leftPrev = curr
            curr = curr?.next
        }
        var prev: ListNode? = null
        repeat(right - left + 1){
            val temp = curr?.next
            curr?.next = prev
            prev = curr
            curr = temp
        }
        leftPrev?.next?.next = curr
        leftPrev?.next = prev
        return dummyNode?.next
    }
}
