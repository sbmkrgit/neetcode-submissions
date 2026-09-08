/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var temp1 = l1
        var temp2 = l2
        var carry = 0
        val dummyNode = ListNode(-1)
        var curr = dummyNode
        while(temp1 != null || temp2 != null) {
            var sum = (temp1?.`val` ?: 0) + (temp2?.`val` ?: 0) + carry
            val node = ListNode(sum%10)
            curr.next = node
            carry = sum/10
            temp1 = temp1?.next
            temp2 = temp2?.next
            curr = curr.next!!
        }
        if(carry != 0){
            curr.next = ListNode(carry)
        }
        return dummyNode.next
    }
}
