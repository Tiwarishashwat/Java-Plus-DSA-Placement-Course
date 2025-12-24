class Solution {
    public void solveSudoku(char[][] board) {
        backtrack(board,0,0);
    }
    private boolean backtrack(char board[][], int row, int col){
        //base case
        if(col == 9){
            col =0;
            row = row+1;
        }
        if(row == 9){
            return true;
        }
        //if already filled
        if(board[row][col]!='.') {
            return backtrack(board, row, col+1);
        }

        for(int d=1;d<=9;d++){
            char digit = (char)(d+'0');
            if(isPlacementPossible(digit, board, row, col)){
                board[row][col] = digit;
                if(backtrack(board,row,col+1)){
                    return true;
                }
                board[row][col] = '.';
            }
        }
        return false;
    }
    private boolean isPlacementPossible(char digit, char board[][], int row, int col){
        // current row
        //current col
        // grid
        for(int j=0;j<9;j++){
            //current row
            if(board[row][j] == digit) return false;
            //current col
            if(board[j][col] == digit) return false;
            //grid
            int r = 3*(row/3) + (j/3);
            int c = 3*(col/3) + (j%3);
            if(board[r][c] == digit) return false;
        }
        return true;
    }
}