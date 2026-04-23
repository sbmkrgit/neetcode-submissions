class Solution {
    fun numRescueBoats(people: IntArray, limit: Int): Int {
        people.sort()
        var l = 0
        var r = people.size - 1
        var count = 0
        while(l<=r){
            val remain = limit - people[r]
            r--
            count++
            if(l<=r && remain >= people[l]){
                l++
            }
        }
        return count
    }
}
