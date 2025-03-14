package _10_Recursions;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]arr={12,23,34,45,56,78,89};
        int n=arr.length;
        reverse(0,n-1,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int l,int r,int[]arr)
    {
        if(l>=r) return;
        swap(l,r,arr);
        reverse(l+1,r-1,arr);
    }
    public static void swap(int i,int j,int[]arr)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
