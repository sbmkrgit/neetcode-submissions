class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for(row in 0 until 9){
            val set = mutableSetOf<Char>()
            for(i in 0 until 9){
                if(board[row][i] == '.') continue
                if(board[row][i] in set) return false
                set.add(board[row][i])
            }
        }

        for(col in 0 until 9){
            val set = mutableSetOf<Char>()
            for(i in 0 until 9){
                if(board[i][col] == '.') continue
                if(board[i][col] in set) return false
                set.add(board[i][col])
            }
        }

        for(square in 0 until 9){
            val set = mutableSetOf<Char>()
            for(i in 0 until 3){
                for(j in 0 until 3){
                    val row = (square/3) * 3 + i
                    val col = (square%3) * 3 + j
                    if(board[row][col] == '.') continue
                    if(board[row][col] in set) return false
                    set.add(board[row][col])
                }
            }
        }

        return true
    }
}
