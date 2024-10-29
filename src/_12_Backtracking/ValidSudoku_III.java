package _12_Backtracking;
//https://leetcode.com/problems/valid-sudoku/description/
public class ValidSudoku_III {
    public static void main(String[] args) {
        char[][] board = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][]board)
    {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]!='.')
                {
                    if(!isValid(board,i,j)) return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][]board,int i,int j)
    {
        //vertically
        for(int row=0;row<board.length;row++)
        {
            if(row!=i && board[row][j]==board[i][j]) return false;
        }
        //horizontally
        for(int col=0;col<board.length;col++)
        {
            if(col!=j && board[i][col]==board[i][j]) return false;
        }

        int sqrt=(int)Math.sqrt(board.length);
        int rstart=i-i%sqrt;
        int cstart=j-j%sqrt;

        for(int row=rstart;row<rstart+sqrt;row++)
        {
            for(int col=cstart;col<cstart+sqrt;col++)
            {
                if((row!=i && col!=j) && board[row][col]==board[i][j]) return false;
            }
        }
        return true;
    }
}
