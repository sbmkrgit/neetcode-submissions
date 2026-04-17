class Solution {
    fun isPalindrome(s: String): Boolean {
        if(s.isEmpty()) return false
        var i = 0
        var j = s.lastIndex
        while(i<j){
            while(i<j && !s[i].isLetterOrDigit()){
                i++
            }
            while(i<j && !s[j].isLetterOrDigit()){
                j--
            }
            if(s[i].lowercase() != s[j].lowercase()){
                return false
            }
            i++
            j--
        }
        return true
    }
}
