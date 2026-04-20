class Solution {
    fun majorityElement(nums: IntArray): Int {
        var ans  = -1
        val map = HashMap<Int,Int>()
        for(num in nums){
            map[num] = map.getOrDefault(num, 0) + 1
        }
        for((key, value) in map){
            if(value > nums.size / 2){
                ans = key
            }
        }
        return ans
    }
}
