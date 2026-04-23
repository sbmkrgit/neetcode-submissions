class Solution {
    fun firstMissingPositive(nums: IntArray): Int {
        val n = nums.size
        val seen = BooleanArray(n)
        for(num in nums){
            if(num in 1..n){
                seen[num-1] = true
            }
        }
        for(i in 0 until n){
            if(!seen[i]){
                return i + 1
            }
        }
        return n + 1
    }
}
