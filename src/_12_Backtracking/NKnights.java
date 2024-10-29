package _12_Backtracking;

public class NKnights {
    public static void main(String[] args) {
        int n=4;
        int knights=4;
        boolean[][]board=new boolean[n][n];
        Knight(board,0,0,knights);
    }
    public static void Knight(boolean[][]board,int row,int col,int knights)
    {
        if(knights==0)
        {
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col==board.length)
        {
            return;
        }
        if(col==board.length)
        {
            Knight(board,row+1,0,knights);
            return;
        }
        if( isSafe(board,row,col))
        {
            board[row][col]=true;
            Knight(board,row,col+1,knights-1);
            board[row][col]=false;
        }
        Knight(board,row,col+1,knights);
    }
    public static void display(boolean [][]board)
    {
        for(boolean []row:board)
        {
            for(boolean val :row)
            {
                if(val)
                {
                    System.out.print("K ");
                }
                else System.out.print("+ ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(boolean[][]board,int row,int col)
    {
        if(isValid(board,row,col))
        {
            if(board[row][col]) return false;
        }
        if(isValid(board,row-2,col-1))
        {
            if(board[row-2][col-1]) return false;
        }
        if(isValid(board,row-2,col+1))
        {
            if(board[row-2][col+1]) return false;
        }
        if(isValid(board,row-1,col-2))
        {
            if(board[row-1][col-2]) return false;
        }
        if(isValid(board,row-1,col+2))
        {
            if(board[row-1][col+2]) return false;
        }
        return true;
    }
    public static boolean isValid(boolean[][]board,int row,int col)
    {
        if(row>=0 && row <board.length && col>=0 && col< board.length) return true;
        return false;
    }
}


