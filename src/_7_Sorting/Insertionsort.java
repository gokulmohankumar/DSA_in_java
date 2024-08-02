package _7_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    private static void insertionSort(int[]arr,int n)
    {
        for(int i = 0; i < n-1; i++) {
            for (int j = i+1; j>0; j--) {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }
    private static void swap(int[]arr,int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
