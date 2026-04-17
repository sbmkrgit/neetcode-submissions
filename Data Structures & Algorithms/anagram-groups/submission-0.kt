class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = HashMap<String, MutableList<String>>()
        for(str in strs){
            val count = IntArray(26)
            for(char in str){
                count[char - 'a']++
            }
            val key = count.joinToString("@")
            if(map.containsKey(key)){
                map.get(key)?.add(str)
            } else {
                map[key] = mutableListOf(str)
            }
        }

        return map.values.toList()
    }
}
