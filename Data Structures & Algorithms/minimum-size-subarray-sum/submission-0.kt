class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var res = Int.MAX_VALUE
        var sum = 0
        var l = 0
        for(r in nums.indices){
            sum = sum + nums[r]
            while(sum >= target){
                res = minOf(res, r-l+1)
                sum = sum - nums[l]
                l++
            }
        }
        if(res == Int.MAX_VALUE) return 0
        return res
    }
}
