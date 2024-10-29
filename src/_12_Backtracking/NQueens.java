package _12_Backtracking;

import java.util.Scanner;

public class NQueens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the board (n X n) : ");
        int n=in.nextInt();
        boolean[][]board=new boolean[n][n];
        int ways=queens(board,0);
        System.out.println("Number of ways : "+ways);
    }
    public static int queens(boolean[][]board,int row)
    {
        if(row==board.length)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col< board[row].length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;
                count+=queens(board,row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    public static void display(boolean[][]board)
    {
        for(boolean[]row:board)
        {
            for(boolean val: row)
            {
                if(val) System.out.print("Q ");
                else System.out.print("+ ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(boolean[][]board,int row,int col)
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
