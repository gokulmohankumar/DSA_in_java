package _3_Arrays;

public class MaximumANDpair {
    private static int checkBits(int []arr,int mask)
    {
        int count=0;
        for (int j : arr) {
            if ((mask & j) == mask) {
                count++;
            }
        }
        return count;
    }
    private static int maxAndValue(int[]arr)
    {
        int mask;
        int res=0;
        for(int i=31;i>=0;i--)
        {
            mask=1<<i | res;
            int count= checkBits(arr,mask);
            if(count>=2)
            {
                res=res | mask;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={16,9,6,13};
        System.out.println(maxAndValue(arr));
    }
}
