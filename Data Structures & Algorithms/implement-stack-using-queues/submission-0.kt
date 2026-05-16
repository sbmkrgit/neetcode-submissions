class MyStack() {

    val stack = mutableListOf<Int>()

    fun push(x: Int) {
        stack.add(x)
    }

    fun pop(): Int {
        return stack.removeLast()
    }

    fun top(): Int {
        return stack.last()
    }

    fun empty(): Boolean {
        return stack.isEmpty()
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * val obj = MyStack()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.top()
 * val param_4 = obj.empty()
 */
