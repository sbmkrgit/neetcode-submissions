class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        val freq = IntArray(26)
        var l = 0
        var maxFreq = 0
        var maxLength = 0
        for(r in s.indices){
            freq[s[r] - 'A']++
            maxFreq = maxOf(maxFreq, freq[s[r]-'A'])
            val length = r-l+1
            if(length - maxFreq > k){
                freq[s[l] - 'A']--
                l++
            }
            maxLength = maxOf(maxLength, r-l+1)
        }
        return maxLength
    }
}
