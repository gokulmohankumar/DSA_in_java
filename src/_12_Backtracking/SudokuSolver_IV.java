package _12_Backtracking;

import java.util.Arrays;

public class SudokuSolver_IV {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
       solveSudoku(board);
           for (char[] rows : board) {
               System.out.println((Arrays.toString(rows)));
           }
    }
    public static boolean solveSudoku(char[][] board)
    {
        int n=board.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
            {
                if(board[i][j]=='.')
                {
                    row=i;
                    col=j;
                    emptyLeft=true;
                    break;
                }
            }
            if(emptyLeft) break;
        }
        if(!emptyLeft)
        {
            return true;
        }
        for(int num=1;num<=9;num++)
        {
            char ch=(char)(num+'0');
            if(isSafe(board,row,col,ch))
            {
                 board[row][col]=ch;
                 if(solveSudoku(board))
                 {
                     return true;
                 }
                 else {
                     board[row][col] = '.';
                 }
            }
        }
        return false;
    }
    public static boolean isSafe(char[][]board,int row,int col,char ch) {
        for(int Rows=0;Rows<board.length;Rows++)
        {
            if(board[Rows][col]==ch)return false;
        }
        for(int Cols = 0; Cols <board.length; Cols++)
        {
            if(board[row][Cols]==ch)return false;
        }
        int sqrt=(int)Math.sqrt(board.length);
        int rstart=row-row%sqrt;
        int cstart=col-col%sqrt;
        for(int i=rstart;i<rstart+sqrt;i++)
        {
            for (int j = cstart; j < cstart+sqrt; j++) {
                  if(board[i][j]==ch) return false;
            }
        }
        return true;
    }
}
