package __10_Recursions;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        printTriangle(arr);
    }
    public static void printTriangle(int[]A)
    {
        int n=A.length;
        if(A.length<1)
        {
            return;
        }
        int[]temp=new int[n-1];
        for (int i = 0; i < n-1; i++) {
            temp[i]=A[i]+A[i+1];
        }
        printTriangle(temp);
        System.out.println(Arrays.toString(A));
    }
}
