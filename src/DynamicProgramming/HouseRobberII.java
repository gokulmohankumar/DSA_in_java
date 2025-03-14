package DynamicProgramming;


public class HouseRobberII {
    public static void main(String[] args) {
        int[]valueInHouse={1,3,2,1};
        System.out.println(houseRobber(valueInHouse));
    }
    public static long houseRobber(int[] valueInHouse) {
        int n=valueInHouse.length;
        int[]arr1=new int[n-1];
        int[]arr2=new int[n-1];
        if(n==1)return valueInHouse[0];
        for(int i=0;i<n;i++)
        {
            if(i!=0) arr1[i-1]=valueInHouse[i];
            if(i!=n-1) arr2[i]=valueInHouse[i];
        }
        long ans1=helper(arr1);
        long ans2=helper(arr2);
        return Math.max(ans1,ans2);
    }
    public static long helper(int[]value)
    {
        int n=value.length;
        long prev1=value[0];
        long prev2=0;
        for(int i=1;i<n;i++)
        {
            long take=value[i];
            if(i>1) take+=prev2;
            long notake=prev1;
            long curi=Math.max(take,notake);
            prev2=prev1;
            prev1=curi;
        }
        return prev1;
    }
}
