package DynamicProgramming;

import java.util.Arrays;

public class MaxsumNonAdjacent {
    public static void main(String[] args) {
        int[]arr={10,20,10,30,15,80};
        int ind=arr.length-1;
        System.out.println(maxSum(arr,ind) + " Recursion");
        int[]dp=new int[arr.length];
        Arrays.fill(dp,-1);
        dp[0]=arr[0];
        System.out.println(maxSumMemo(arr,ind,dp)+" Memoization");
        System.out.println(maxSumTab(arr,ind)+" Tabulation");
        System.out.println(maxSumOptimized(arr,ind)+" Optimized ");
    }
    public static int maxSum(int[]arr,int ind)
    {
        if(ind==0) return arr[ind];
        if(ind<0) return 0;
        int pick=arr[ind]+maxSum(arr,ind-2);
        int nonpick= maxSum(arr, ind - 1);
        return Math.max(pick,nonpick);
    }
    public static int maxSumMemo(int[]arr,int ind,int[]dp)
    {
        if(ind<0) return 0;
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int pick=arr[ind]+maxSum(arr,ind-2);
        int nonpick= maxSum(arr, ind - 1);
        return dp[ind]=Math.max(pick,nonpick);
    }
    public static int maxSumTab(int[]arr,int ind)
    {
        int[]dp=new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for (int i=2;i<=ind;i++)
        {
            int fs=arr[i]+dp[i-2];
            int ss=dp[i-1];
            dp[i]=Math.max(fs,ss);
        }
        return dp[ind];
    }
    public static int maxSumOptimized(int[]arr,int ind)
    {
        int prev2=arr[0];
        int prev1=Math.max(arr[0],arr[1]);
        for (int i = 2; i <=ind; i++) {
            int fs=arr[i]+prev2;
            int ss=prev1;
            int cur=Math.max(fs,ss);
            prev2=prev1;
            prev1=cur;
        }
        return prev1;
    }
}
