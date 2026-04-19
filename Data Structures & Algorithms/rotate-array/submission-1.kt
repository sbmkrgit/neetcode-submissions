class Solution {
    fun rotate(nums: IntArray, k: Int) {
        fun rotate(from: Int, to: Int){
            var i = from
            var j = to
            while(i<j){
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
                i++
                j--
            }
        }
        val shifts = k % nums.size
        rotate(0, nums.size - 1)
        rotate(0, shifts-1)
        rotate(shifts, nums.size -1)
    }
}
