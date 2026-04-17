class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""
        var pre = strs[0]
        for(i in 1 until strs.size){
            while(!strs[i].startsWith(pre)){
                pre = pre.substring(0, pre.length - 1)
                if(pre.isEmpty()) return ""
            }
        }
        return pre
    }
}
