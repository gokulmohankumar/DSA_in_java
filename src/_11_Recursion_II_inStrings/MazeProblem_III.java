package _11_Recursion_II_inStrings;

import java.util.ArrayList;
import java.util.List;

public class MazeProblem_III {
    public static void main(String[] args) {
        boolean[][] arr={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        System.out.println(findCountOfWays(arr,2,2));
        System.out.println(findAllways(arr,0,0,""));
    }
    public static int findCountOfWays(boolean[][]arr,int r,int c)
    {
        if(!arr[r][c])
        {
            return 0;
        }
       if(c==0 || r==0)
       {
           return 1;
       }
       int count=0;
       count+=findCountOfWays(arr,r-1,c)+findCountOfWays(arr,r,c-1)+findCountOfWays(arr,r-1,c-1);
       return count;
    }
    public static List<String> findAllways(boolean[][] maze,int r,int c,String res)
    {
        if(r==maze.length-1 && c==maze[0].length-1)
        {
            List<String>inlist=new ArrayList<>();
            inlist.add(res);
            return inlist;
        }
        List<String>myList=new ArrayList<>();
        if((c<maze[0].length-1 && r<maze.length-1 ) && maze[r + 1][c+1])
        {
            myList.addAll(findAllways(maze,r+1,c+1,res+"Dg"));
        }
        if(r<maze.length-1 && maze[r + 1][c])
        {
            myList.addAll(findAllways(maze,r+1,c,res+"D"));
        }
        if(c<maze[0].length-1 && maze[r][c+1])
        {
            myList.addAll(findAllways(maze,r,c+1,res+"R"));
        }
        return myList;
    }
}
