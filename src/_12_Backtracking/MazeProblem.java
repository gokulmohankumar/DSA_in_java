package _12_Backtracking;

public class MazeProblem {
    public static void main(String[] args) {
        boolean[][]arr={
                {true,true,true},
                {true,true,true},
                {true,true,true},
        };
        findAllPaths(arr,0,0,"");
    }
    public static void findAllPaths(boolean[][]maze,int r,int c,String res)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(res);
            return;
        }
        if(!maze[r][c])
        { 
            return;
        }
        maze[r][c]=false;
        if(r<maze.length-1)
        {
            findAllPaths(maze,r+1,c,res+"D");
        }
        if(c<maze[0].length-1)
        {
            findAllPaths(maze,r,c+1,res+"R");
        }
        if(r>0)
        {
            findAllPaths(maze,r-1,c,res+"U");
        }

        if(c>0)
        {
            findAllPaths(maze,r,c-1,res+"L");
        }
        maze[r][c]=true;
    }
}
