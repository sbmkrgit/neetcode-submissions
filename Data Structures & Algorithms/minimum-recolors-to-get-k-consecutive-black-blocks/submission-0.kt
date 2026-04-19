class Solution {
    fun minimumRecolors(blocks: String, k: Int): Int {
        var result = blocks.length
        for(i in 0 until blocks.length - k + 1){
            var count = 0
            var idx = i
            while(idx < i+k){
                if(blocks[idx] == 'W'){
                    count++
                }
                idx++
            }
            result = minOf(result, count)
        }
        return result
    }
}
