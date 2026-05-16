class MyQueue() {

    val q = mutableListOf<Int>()

    fun push(x: Int) {
        q.add(x)
    }

    fun pop(): Int {
        return q.removeFirst()
    }

    fun peek(): Int {
        return q.first()
    }

    fun empty(): Boolean {
        return q.isEmpty()
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * val obj = MyQueue()
 * obj.push(x)
 * val param_2 = obj.pop()
 * val param_3 = obj.peek()
 * val param_4 = obj.empty()
 */
