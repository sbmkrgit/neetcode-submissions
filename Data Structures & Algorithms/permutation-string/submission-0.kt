class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        val freqArrS1 = IntArray(26)
        for(i in s1.indices){
            freqArrS1[s1[i] - 'a']++
        }
        val need = s1.length
        for(i in s2.indices){
            val windowFreqArr = IntArray(26)
            var windowIdx = 0
            var idx = i
            while(windowIdx < need && idx<s2.length){
                windowFreqArr[s2[idx]- 'a']++
                windowIdx++
                idx++
            }
            if(isFreqSame(freqArrS1, windowFreqArr)){
                return true
            }
        }
        return false
    }

    fun isFreqSame(arr1: IntArray, arr2: IntArray): Boolean{
        for(i in 0 until 26){
            if(arr1[i] != arr2[i]) return false
        }
        return true
    }
}
