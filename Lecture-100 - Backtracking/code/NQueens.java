import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]= new char[n][n];
        //fill with .
        for(int i=0;i<n;i++){
            Arrays.fill(board[i], '.');
        }
        List<List<String>> res = new ArrayList<>();
        backtrack(0,res,board);
        return res;
    }
    private void backtrack(int col, List<List<String>> res, char board[][]){
        int n = board.length;
        //base case
        if(col == n){
            constructRes(board, res);
            return;
        }
        for(int row=0;row<n;row++){
            if(isSafe(board, row, col)){
                board[row][col] = 'Q';
                backtrack(col+1, res, board);
                board[row][col] = '.';
            }
        }
    }
    private boolean isSafe(char board[][], int r, int c){
        int n = board.length;
        for(int k=1;k<=c;k++){
            int col = c-k;
            //upper diagonal
            int row = r-k;
            if(row>=0){
                if(board[row][col]=='Q') return false;
            }
            //lower diagonal
            row = r+k;
            if(row<n){
                if(board[row][col]=='Q') return false;
            }
            //current row
            if(board[r][col]=='Q') return false;
        }
        return true;
    }

    private void constructRes(char board[][], List<List<String>> res){
        List<String> current = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row = new String(board[i]);
            current.add(row);
        }
        res.add(current);
    }
}