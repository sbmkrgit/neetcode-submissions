class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var l = 0
        var r = 0
        var n = nums.size
        while(r<n){
            nums[l] = nums[r]
            while(r<n && nums[l] == nums[r]){
                r++
            }
            l++
        }
        return l
    }
}
