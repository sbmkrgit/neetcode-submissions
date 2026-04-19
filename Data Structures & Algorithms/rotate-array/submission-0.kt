class Solution {
    fun rotate(nums: IntArray, k: Int) {
        val kMod = k % nums.size
        val rotated = nums.takeLast(kMod) + nums.dropLast(kMod)
        for(i in nums.indices){
            nums[i] = rotated[i]
        }
        return
    }
}
