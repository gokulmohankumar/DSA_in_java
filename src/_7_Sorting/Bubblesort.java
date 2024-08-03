package _7_Sorting;

import java.util.Arrays;
import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n= in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        bubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubbleSort(int[] arr, int n) {
        boolean swapped=false;
        for(int i = 0; i < n; i++) {
            for(int j=1;j<n-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
            {
                System.out.println("Array is already sorted");
                break;
            }
        }
    }
}
