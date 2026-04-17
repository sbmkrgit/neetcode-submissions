class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val result = IntArray(k)
        val map = HashMap<Int, Int>()
        for(num in nums){
            if(map.containsKey(num)){
                map[num] = map.getOrDefault(num, 0) + 1
            } else {
                map[num] = 1
            }
        }

        val sortedMapList = map.entries.sortedByDescending { it.value}.toList()
        for(i in result.indices){
            result[i] = sortedMapList[i].key
        }

        return result
    }
}
