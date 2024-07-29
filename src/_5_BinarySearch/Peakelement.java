package _5_BinarySearch;

public class Peakelement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,3,1};
        int peakIndex=findPeak(arr);
        System.out.println(peakIndex);
    }
    private static int findPeak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            {
                ans=mid;
                end=mid-1;
            }
            else {
               start=mid+1;
            }
        }
        return ans;
    }
}
