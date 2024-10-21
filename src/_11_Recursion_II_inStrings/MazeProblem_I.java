package _11_Recursion_II_inStrings;

import java.util.Scanner;

//Maze problem , consider m*n matrix , you are in (1,1), and you have to reach the last (m,n) position,
//This program will give in how many ways you can reach
public class MazeProblem_I {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the m and n value");
        int m=in.nextInt();
        int n=in.nextInt();
        int ans=findCount(m,n);
        System.out.println("You can reach the destination in "+ans+" ways");
    }
    public static int findCount(int row,int col)
    {
        if(row==1 || col==1)
        {
            return 1;
        }
        int count=0;
        count+=findCount(row-1,col)+findCount(row,col-1);
        return count;
    }

}
