package _12_Backtracking;

import java.util.Arrays;

public class SudokuSolver_I {
    public static void main(String[] args) {
        int[][]sudo={
                {8,4,0,6,3,7,1,2,0},
                {7,6,0,9,4,0,0,0,5},
                {2,9,0,8,0,5,7,6,0},
                {0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,8,9,0,7},
                {6,7,0,0,0,0,0,1,3},
                {0,1,6,7,2,0,0,0,8},
                {5,0,0,0,0,3,0,7,6},
                {4,0,7,5,0,0,0,9,0},
        };
        solve(sudo,0,0);

    }
    public static void solve(int[][]sudo,int row,int col)
    {
        if(row==sudo.length)
        {
            for(int[]rows:sudo)
            {
                System.out.println(Arrays.toString(rows));
            }
            return;
        }
        if(col==sudo.length)
        {
            solve(sudo,row+1,0);
            return;
        }
        if(sudo[row][col]==0)
        {
            for(int i=1;i<=9;i++) {
                if (isValid(sudo, row, col, i)) {
                    sudo[row][col] = i;
                    solve(sudo, row, col + 1);
                    sudo[row][col] = 0;
                }
            }
            return;
        }
        solve(sudo, row, col + 1);
    }
    public static boolean isValid(int[][]sudo,int row,int col,int i)
    {
        //vertically
        for(int cols=0;cols<sudo.length;cols++)
        {
            if(sudo[row][cols]==i)return false;
        }

        //horizontally
        for(int rows=0;rows<sudo.length;rows++)
        {
            if(sudo[rows][col]==i)return false;
        }

        //subgrid
        int cstart=col-(col%3);
        int rstart=row-(row%3);
        for (int r = rstart; r< rstart+3 ; r++) {
            for (int c = cstart; c < cstart+3; c++) {
                if(sudo[r][c]==i) return false;
            }
        }
        return true;
    }
}
