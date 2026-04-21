class Solution {
    fun majorityElement(nums: IntArray): List<Int> {
        val result = mutableListOf<Int>()
        val map = HashMap<Int,Int>()
        for(num in nums){
            map[num] = map.getOrDefault(num, 0) + 1
        }
        for((key, value) in  map){
            if(value > nums.size / 3){
                result.add(key)
            }
        }
        return result
    }
}
