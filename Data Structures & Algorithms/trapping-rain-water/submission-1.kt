class Solution {
    fun trap(height: IntArray): Int {
        var lMax = 0
        var rMax = 0
        var i = 0
        var j = height.lastIndex
        var ans = 0

        while(i<j){
            lMax = maxOf(lMax, height[i])
            rMax = maxOf(rMax, height[j])
            if(lMax < rMax){
                ans = ans + lMax - height[i]
                i++
            } else {
                ans  = ans + rMax - height[j]
                j--
            }
        }
        return ans
    }
}
