package __10_Recursions;
//Question from Geeks for Geeks
//link: https://www.geeksforgeeks.org/problems/geek-onacci-number/0

import java.util.Scanner;

public class FindNthTerm {
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int A=in.nextInt();
            int B=in.nextInt();
            int C=in.nextInt();
            int N=in.nextInt();
            System.out.println(findNthTerm(N,A,B,C));
        }
    }
    public static int findNthTerm(int n,int a,int b,int c)
    {
        if(n==1) return a;
        if(n==2) return b;
        if(n==3) return c;
        return findNthTerm(n-1,a,b,c)+findNthTerm(n-2,a,b,c)+findNthTerm(n-3,a,b,c);
    }
}

//Input:
//3
//1 3 2 4
//1 3 2 5
//1 3 2 6
//
//Output:
//6
//11
//19