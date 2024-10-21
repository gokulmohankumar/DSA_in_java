package _11_Recursion_II_inStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Maze problem , consider m*n matrix , you are in (1,1), and you have to reach the last (m,n) position,
//This program will give the possible ways you can reach the destination by moving (Down (D), Right(R) ,Diagnolly(Dg)).
public class MazeProblem_II {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter m and n value");
        int m=in.nextInt();
        int n= in.nextInt();
        System.out.println(findWays(m,n,""));
    }

    public static List<String> findWays(int r,int c,String p)
    {
        if(r==1 && c==1)
        {
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String>list=new ArrayList<>();
        if(r>1 && c>1)
        {
            list.addAll(findWays(r-1,c-1,p+"Dg"));
        }
        if(r>1)
        {
           list.addAll(findWays(r-1,c,p+"D"));
        }
        if(c>1)
        {
          list.addAll(findWays(r,c-1,p+"R"));
        }
        return list;
    }
}
