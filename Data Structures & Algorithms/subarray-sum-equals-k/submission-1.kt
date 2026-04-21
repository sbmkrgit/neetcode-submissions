class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        var currentSum = 0
        var count = 0
        val map = HashMap<Int, Int>()
        map[0] = 1
        for(num in  nums){
            currentSum+=num
            count+= map.getOrDefault(currentSum - k, 0)
            map[currentSum] = map.getOrDefault(currentSum, 0) + 1 
        }
        return count
        
    }
}
