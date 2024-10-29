package _12_Backtracking;

public class SudokuSolver_II {
    public static void main(String[] args) {
        int[][] sudo = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(solve(sudo))
        {
            for(int[]rows:sudo)
            {
                for(int num:rows)
                {
                    System.out.print(num+" | ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("cannot be solved");
        }
    }
    public static boolean solve(int[][]sudo)
    {
        int n=sudo.length;
        int row=-1;
        int col=-1;
        boolean emptyLeft=false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(sudo[i][j]==0)
                {
                    row=i;
                    col=j;
                    emptyLeft=true;
                    break;
                }
            }
            if(emptyLeft==true) break;
        }
        if(emptyLeft==false)
        {
            return true;
        }

        for(int num=1;num<=9;num++)
        {
            if(isSafe(sudo,row,col,num))
            {
                sudo[row][col]=num;
                if(solve(sudo))
                {
                    return true;
                }
                else {
                    sudo[row][col]=0;
                }
            }
        }
        return false;
    }
    public static boolean isSafe(int[][]sudo,int row,int col,int num)
    {
        //vertically
        for(int cols=0;cols<sudo.length;cols++)
        {
            if(sudo[row][cols]== num)return false;
        }

        //horizontally
        for(int rows=0;rows<sudo.length;rows++)
        {
            if(sudo[rows][col]== num)return false;
        }

        //subgrid
        int cstart=col-(col%3);
        int rstart=row-(row%3);
        for (int r = rstart; r< rstart+3 ; r++) {
            for (int c = cstart; c < cstart+3; c++) {
                if(sudo[r][c]== num) return false;
            }
        }
        return true;
    }
}
