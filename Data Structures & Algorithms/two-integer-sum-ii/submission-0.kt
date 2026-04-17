class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        for(i in numbers.indices){
            var l = i+1
            var r = numbers.lastIndex
            var tempTarget = target - numbers[i]
            while(l<=r){
                val mid = l + (r-l)/2
                when {
                    numbers[mid] == tempTarget -> return intArrayOf(i + 1, mid + 1)
                    tempTarget > numbers[mid] -> l = mid + 1
                    else -> r = mid - 1
                }
            }
        }
        return intArrayOf()
    }
}
