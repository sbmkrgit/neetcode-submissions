class Solution {
    fun sortColors(nums: IntArray) {
        var zero = 0
        var one = 0
        for(two in nums.indices){
            val tmp = nums[two]
            nums[two] = 2
            if(tmp < 2){
                nums[one] = 1
                one++
            }
            if(tmp < 1){
                nums[zero] = 0
                zero++
            }
        }
    }
}
