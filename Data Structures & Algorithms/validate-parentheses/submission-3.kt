class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for(char in s){
            when(char) {
                ')' -> {
                    if(stack.isEmpty() || stack.removeLast() != '(') 
                        return false
                }
                '}' -> {
                    if(stack.isEmpty() || stack.removeLast() != '{') 
                        return false
                }
                ']' -> {
                    if(stack.isEmpty() || stack.removeLast() != '[') 
                        return false
                }
                else -> {
                    stack.add(char)
                }
            }
        }
        if(stack.isNotEmpty()) return false
        return true
    }
}
