class MinStack() {

    val stack = mutableListOf<Int>()
    val minStack = mutableListOf<Int>()

    fun push(`val`: Int) {
        stack.add(`val`)
        val minValue = if(minStack.isNotEmpty()) minOf(minStack.last(), `val`)
                    else `val`
        minStack.add(minValue)
         
    }

    fun pop() {
        stack.removeLast()
        minStack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun getMin(): Int {
        return minStack.last()
    }
}
