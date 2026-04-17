class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var maxSum = Int.MIN_VALUE
        var currentSum = 0
        for(num in nums) {
            if(currentSum < 0) {
                currentSum = 0
            }
            currentSum = currentSum + num
            maxSum = maxOf(currentSum, maxSum)
        }
        return maxSum
    }
}
