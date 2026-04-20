class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var ans = ""
        var i = 0
        var j = 0
        while(i < word1.length && j < word2.length){
            ans = ans + word1[i].toString() + word2[j].toString()
            i++
            j++
        }
        while(i < word1.length){
            ans = ans + word1[i].toString()
            i++
        }
        while(j < word2.length){
            ans = ans + word2[j].toString()
            j++
        }
        return ans
    }
}
