package _10_Recursions;

import java.util.Scanner;

public class FindingElement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target element to check present or not");
        int k= in.nextInt();
        System.out.println("Searched element in the index : "+searchElement(arr,k,0));
    }
    static int searchElement(int[]arr,int k,int i)
    {
        if(i>arr.length-1)
        {
            return -1;
        }
        if(arr[i]==k)
        {
            return i;
        }
        return searchElement(arr,k,i+1);
    }
}
