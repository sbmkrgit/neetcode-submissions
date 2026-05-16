class Solution {
    fun calPoints(operations: Array<String>): Int {
        val stack = mutableListOf<Int>()
        var res = 0
        for(op in operations){
            when(op){
                "+" -> {
                    val top = stack.removeLast()
                    val newTop = top + stack.last()
                    stack.add(top)
                    stack.add(newTop)
                    res += newTop
                }

                "D" -> {
                    val doubleVal = 2 * stack.last()
                    stack.add(doubleVal)
                    res += doubleVal
                }

                "C" -> {
                    val top = stack.removeLast()
                    res -= top
                }

                else -> {
                    val num = op.toInt()
                    stack.add(num)
                    res += num
                }
            }
        }
        return res
    }
}
