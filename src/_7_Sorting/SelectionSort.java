package _7_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        selectionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int last=n-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    private static void swap(int[]arr,int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    private static int getMaxIndex(int[] arr, int start, int last) {
        int max=start;
        for (int i = start; i <=last; i++) {
            if(arr[i]>arr[max])
            {
                max=i;
            }
        }
        return max;
    }
}
