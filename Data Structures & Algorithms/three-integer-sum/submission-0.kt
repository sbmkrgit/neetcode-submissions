class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        if(nums.isEmpty()) return emptyList()
        nums.sort()
        val result = mutableListOf<List<Int>>()
        for(i in nums.indices){
            if(i>0 && nums[i-1]==nums[i]) continue
            var l = i + 1
            var r = nums.lastIndex
            while(l<r){
                val sum = nums[i] + nums[l] + nums[r]
                when {
                    sum == 0 -> {
                        result.add(listOf(nums[i], nums[l], nums[r]))
                        r--
                        l++
                        while(l<r && nums[r] == nums[r+1]) r--
                        while(l<r && nums[l]== nums[l-1]) l++
                    }
                    sum > 0 -> r--
                    else -> l++
                }
            }
        }
        return result
    }
}
