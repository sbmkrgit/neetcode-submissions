class Solution {
    fun findClosestElements(arr: IntArray, k: Int, x: Int): List<Int> {
        var l = 0
        var r = arr.size - 1
        while(r-l+1>k){
            if(abs(arr[r] - x) >= abs(arr[l] - x)){
                r--
            } else {
                l++
            }
        }
        return arr.slice(l..r)
    }
}
