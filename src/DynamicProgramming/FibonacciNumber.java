package DynamicProgramming;

import java.util.Arrays;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n=7;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(findFibo(n,dp));

        System.out.println(fibo(n));
    }
    public static int findFibo(int n,int[]dp)
    {
         if(n<=1) return n;
         else if(dp[n]!=-1)return dp[n];
         else return dp[n]=findFibo(n-1,dp)+findFibo(n-2,dp);
    }
    //optimized space complexity by tabulation
    public static int fibo(int n)
    {
        if(n<=1) return n;
        int prev2=0;
        int prev1=1;
        for (int i = 2; i <=n ; i++) {
            int curr=prev1+prev2;
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}
