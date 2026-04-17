class Solution {
    fun trap(height: IntArray): Int {
        val lMaxArr = IntArray(height.size)
        val rMaxArr = IntArray(height.size)
        var lMax = -1
        var rMax = -1
        for(i in height.indices){
            if(height[i] > lMax){
                lMax = height[i]
            }
            lMaxArr[i] = lMax
        }

        for(i in height.lastIndex downTo 0){
            if(height[i] > rMax){
                rMax = height[i]
            }
            rMaxArr[i] = rMax
        }

        var result = 0
        for(i in height.indices){
            result = result + minOf(lMaxArr[i], rMaxArr[i]) - height[i]
        }
        return result
    }
}
