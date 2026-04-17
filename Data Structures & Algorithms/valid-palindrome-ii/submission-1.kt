class Solution {
    fun validPalindrome(s: String): Boolean {
        var l = 0
        var r = s.lastIndex 
        while(l<r){
            if(s[l] != s[r]){
                val skipL = s.substring(l+1, r+1)
                val skipR = s.substring(l, r)
                return isPalindrome(skipL) || isPalindrome(skipR)
            }
            l++
            r--
        }
        return true
    }

    fun isPalindrome(s: String): Boolean {
            var l = 0
            var r = s.lastIndex

            while(l<r){
                if(s[l] != s[r]){
                    return false
                }
                l++
                r--
            }

            return true
    }
}
