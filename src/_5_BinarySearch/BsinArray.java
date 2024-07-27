package _5_BinarySearch;

import java.util.Scanner;

public class BsinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int []arr=new int[n];
        System.out.println("enter th elements of Array sorted in Ascending or Descending");
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the target element to find");
        int target=in.nextInt();
        int ans=findelement(arr,target);
        System.out.println(ans);
    }

    private static int findelement(int[] nums, int k) {
        if(nums.length==0) return -1;
        int start=0;
        int end=nums.length-1;
        boolean isAsc=nums[start] < nums[end];

        while(start <= end)
        {
            int mid=start+(end-start)/2;
            if(nums[mid]==k)
            {
                return mid;
            }
            if(isAsc)
            {
                if(k<nums[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else {
                if (k > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
