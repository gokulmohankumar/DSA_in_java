package _12_Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NqueensList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of board (n X n): ");
        int n=in.nextInt();
        boolean[][] board=new boolean[n][n];
        Nqueens(board,0);
        System.out.println(res);
    }
    public static List<List<String>>res = new ArrayList<>();
    public static void Nqueens(boolean[][]board, int row)
    {
        if(row==board.length)
        {
            List<String>l1=new ArrayList<>();
            for(boolean[]rows:board)
            {
                StringBuffer s1=new StringBuffer("");
                for(boolean val:rows)
                {
                    if(val) s1.append("Q");
                    else s1.append(".");
                }
                l1.add(s1.toString());
            }
            res.add(l1);
            return;
        }
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                Nqueens(board,row+1);
                board[row][col]=false;
            }
        }
    }
    public  static boolean isSafe(boolean[][]board,int row,int col)
    {
        //vertically
        for (int i = 0; i < row; i++) {
            if(board[i][col]) return false;
        }

        // diagnol left
        int maxLeft=Math.min(row,col);
        for (int i = 1; i <=maxLeft; i++) {
            if(board[row-i][col-i]) return false;
        }
        //diagnol right
        int maxRight=Math.min(row,board.length-col-1);
        for (int i = 1; i <=maxRight ; i++) {
            if(board[row-i][col+i]) return false;
        }
        return true;
    }
}
