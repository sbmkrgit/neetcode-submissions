class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size - 1
        var ans = nums.size
        while(l<=r){
            val mid = l + (r-l)/2
            when {
                nums[mid] == target -> return mid
                nums[mid] < target -> l = mid + 1
                else -> {
                    ans = mid
                    r = mid - 1  
                }
            }
        }
        return ans
    }
}
