package _7_Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int n=5;
        cyclicSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    private static void cyclicSort(int[]arr,int n)
    {
       int i=0;
       while(i<n)
       {
           int correctIndex=arr[i]-1;
           if(arr[i]!=arr[correctIndex])
           {
               swap(arr,i,correctIndex);
           }
           else {
               i++;
           }
       }
    }
    static void swap(int []arr,int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
