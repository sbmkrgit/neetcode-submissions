/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num: Int): Int
 */

class Solution : GuessGame() {
    fun guessNumber(n: Int): Int {
        var l = 1
        var r = n
        while(true){
            val m = l + (r - l)/2
            val res = guess(m)
            if(res == 1){
                l = m + 1
            } else if(res == -1){
                r = m - 1
            } else if(res == 0){
                return m
            }
        }
    }
}
