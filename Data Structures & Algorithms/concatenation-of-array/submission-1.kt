class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val n = nums.size
        val ans = IntArray(n*2)
        for(i in nums.indices){
            ans[i] = nums[i]
            ans[i+n] = nums[i]
        }
        return ans
    }
}
