/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummyNode = ListNode(0)
        var node: ListNode? = dummyNode
        var temp1 = list1
        var temp2 = list2
        while(temp1 != null && temp2 != null) {
            if(temp1.`val` > temp2.`val`){
                node?.next = temp2
                temp2 = temp2.next
            } else {
                node?.next = temp1
                temp1 = temp1.next
            }
            node = node?.next
        }

        node?.next = temp1 ?: temp2

        return dummyNode.next

    }
}
