class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val set = mutableSetOf<Int>()
        for(i in nums.indices){
            if(set.contains(nums[i])) return true
            set.add(nums[i])
            if(set.size > k){
                set.remove(nums[i-k])
            }
        }
        return false
    }
}
