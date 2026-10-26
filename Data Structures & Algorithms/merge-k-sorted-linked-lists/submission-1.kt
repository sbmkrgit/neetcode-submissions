/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if(lists.isEmpty()){
            return null
        }
        var currentLists = lists.toList()
        while(currentLists.size > 1){
            val mergedList = mutableListOf<ListNode?>()
            for(i in currentLists.indices step 2){
                val l1 = currentLists[i]
                val l2 = if(i+1 < currentLists.size) currentLists[i+1] 
                            else null
                mergedList.add(mergeList(l1, l2))   
            }
            currentLists = mergedList
        }
        return currentLists[0]
    }

    fun mergeList(l1: ListNode?, l2: ListNode?): ListNode? {
        var temp1 = l1
        var temp2 = l2
        val dummyNode: ListNode? = ListNode(-1)
        var tail = dummyNode
        while(temp1 != null && temp2 != null){
            if(temp1.`val` > temp2.`val`){
                tail?.next = temp2
                temp2 = temp2?.next
            } else {
                tail?.next = temp1
                temp1 = temp1?.next
            }
            tail = tail?.next
        }

        tail?.next = temp1 ?: temp2
        return dummyNode?.next
    }

}
