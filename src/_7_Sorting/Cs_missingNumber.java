package _7_Sorting;
//https://leetcode.com/problems/missing-number/
public class Cs_missingNumber {

    public static void main(String[] args) {
        int[]arr={9,6,4,2,3,5,7,0,1};
        System.out.println(find_missing_cyclicSort(arr));
    }
    private static int find_missing_cyclicSort(int[]arr)
    {
        int n = arr.length;
        int i=0;
        while(i<n)
        {
            if(arr[i]<n && arr[i]!=i)
            {
                swap(arr,i,arr[i]);
            }
            else {
                i++;
            }
        }
        for(int index=0;index<n;index++)
        {
            if(arr[index]!=index)
            {
                return index;
            }
        }
        return n;
    }
    static void swap(int []arr,int first, int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    //Another optimal method for this problem
    public static int missingNumber(int[] arr) {
        int n=arr.length;
        int sum=0;
        int expected=n*(n+1)/2;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return expected-sum;
    }
}
