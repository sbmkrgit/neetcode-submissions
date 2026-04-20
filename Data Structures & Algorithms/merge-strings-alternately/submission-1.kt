class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var ans = StringBuilder()
        val lWord1 = word1.length
        val lWord2 = word2.length
        for(i in 0 until maxOf(lWord1, lWord2)){
            if(i<lWord1) ans.append(word1[i])
            if(i<lWord2) ans.append(word2[i])
        }
        return ans.toString()
    }
}
