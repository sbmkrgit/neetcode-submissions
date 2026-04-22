class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.lastIndex
        while(l<=r){
            var mid = (l+r)/2
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> r = mid-1
                else -> l = mid + 1
            } 
        }
        return -1
    }
}
