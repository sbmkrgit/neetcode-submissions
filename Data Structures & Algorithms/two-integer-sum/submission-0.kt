class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>() //value, index
        for(i in nums.indices){
            val complement  = target - nums[i]
            if(map.containsKey(complement)){
                return intArrayOf(map.get(complement)!!, i)
            }
            map.put(nums[i], i)
        }
        return intArrayOf()
    }
}
