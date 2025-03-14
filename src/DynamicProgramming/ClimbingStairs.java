package DynamicProgramming;

import java.util.Arrays;

//https://leetcode.com/problems/climbing-stairs/description/
public class ClimbingStairs {
    public static void main(String[] args) {
        int n=5;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(climbStairsMemiozation(n,dp)+" by Memoization");
        System.out.println(climbStairsRecursion(n) + " by Recursion");
        System.out.println(climbStairsTabulation(n)+" by Tabulation");
        System.out.println(climbStairs(n)+" Space optimized");
    }
    public static int climbStairsRecursion(int n)
    {
        if(n<=1)
        {
            return 1;
        }
        int left=climbStairsRecursion(n-1);
        int right=climbStairsRecursion(n-2);
        return left+right;
    }
    public static int climbStairsMemiozation(int n, int[]dp) {
        if(n<=1)
        {
            return 1;
        }if(dp[n]!=-1)return dp[n];
        return dp[n]=climbStairsMemiozation(n-2,dp)+climbStairsMemiozation(n-1,dp);
    }
    public static int climbStairsTabulation(int n)
    {
        if(n<=1)return n;
        int[]dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <=n ; i++) {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static int climbStairs(int n)
    {
        if(n<=1)return 1;
        int p1=1;
        int p2=1;
        for (int i = 2; i <=n; i++) {
            int cur=p1+p2;
            p2=p1;
            p1=cur;
        }
        return p1;
    }
}
