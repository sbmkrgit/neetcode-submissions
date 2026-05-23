class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = mutableListOf<Int>()
        for(token in tokens){
            when(token){
                "+" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.add(b+a) 
                }
                "-" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.add(b-a)
                }
                "*" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.add(b*a)
                }
                "/" -> {
                    val a = stack.removeLast()
                    val b = stack.removeLast()
                    stack.add(b/a)
                }
                else -> {
                    stack.add(token.toInt())
                }
            }
        }
        return stack.last()
    }
}
