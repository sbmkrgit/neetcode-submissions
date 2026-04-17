class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var l = 0
        var r = 0
        val map = HashMap<Char, Int>()
        var maxLength = 0
        while(r < s.length){
            if(map.containsKey(s.get(r))){
                l = maxOf(l, map[s.get(r)]!! + 1)
            } 
            map[s.get(r)] = r
            val length = r - l + 1
            maxLength = maxOf(maxLength, length)
            r++
        }
        return maxLength
    }
}
