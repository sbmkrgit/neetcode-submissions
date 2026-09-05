/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var count = 0
        var curr = head
        while(curr != null) {
            curr = curr?.next
            count++
        }
        if(count == n){
            return head?.next
        }
        curr = head
        var prev: ListNode? = null
        repeat(count - n){
            prev = curr
            curr = curr?.next
        }
        prev?.next = curr?.next
        return head
    }
}
