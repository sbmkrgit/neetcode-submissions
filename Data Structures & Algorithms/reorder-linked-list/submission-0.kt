/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reorderList(head: ListNode?): Unit {
        var slow = head
        var fast = head?.next
        while(fast != null && fast.next != null){
            slow = slow?.next
            fast = fast?.next?.next
        }
        var second = slow?.next
        slow?.next = null
        var prev: ListNode? = null
        while(second != null) {
            val temp = second?.next
            second?.next = prev
            prev = second
            second = temp
        }
        var first = head
        second = prev
        while(second != null){
            val temp1 = first?.next
            val temp2 = second?.next
            first?.next = second
            second?.next = temp1
            first = temp1
            second = temp2
        }
    }
}
