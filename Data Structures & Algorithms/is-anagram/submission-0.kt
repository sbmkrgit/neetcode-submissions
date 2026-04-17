class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        val map = HashMap<Char, Int>()
        for(char in s){
            if(map.containsKey(char)){
                val freq = (map.get(char) ?: 0) + 1
                map.put(char, freq)
            } else {
                map.put(char, 1)
            }
        }

        for(char in t){
            if(map.containsKey(char) && map.get(char) != 0){
                val freq = (map.get(char) ?: 0) - 1
                map.put(char, freq)
            } else {
                return false
            }
        }
        return true
    }
}
