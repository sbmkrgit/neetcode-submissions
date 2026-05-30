class Solution {
    fun asteroidCollision(asteroids: IntArray): IntArray {
        val stack = mutableListOf<Int>()
        for(a in asteroids){
            var curr  = a
            while(stack.isNotEmpty() && curr < 0 && stack.last() > 0){
                val diff = stack.last() + curr
                if(diff < 0){
                    stack.removeLast()
                } else if(diff > 0){
                    curr = 0
                } else {
                    stack.removeLast()
                    curr = 0
                }
            }
            if(curr != 0){
                stack.add(curr)
            }
        }
        return stack.toIntArray()
    }
}
