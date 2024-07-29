package _5_BinarySearch;

public class SearchinMountainArray {
        public static void main(String[] args) {
            int []arr={4,5,6,7,0,1,2};
            int target=0;
            int peakIndex=findPeak(arr);
            System.out.println("Searching in first half");
            int ans=binarySearch(arr,target,0,peakIndex,true);
            if(ans==-1)
            {
                System.out.println("Not found");
                System.out.println("Searching in second half");
                ans=binarySearch(arr,target,peakIndex,arr.length-1,false);
            }
            System.out.println(ans);
        }
    private static int binarySearch(int[] arr, int target, int start, int end, boolean isAsc) {
            while(start<=end)
            {
                int mid=start+(end-start)/2;
                if(arr[mid]==target)
                {
                    return mid;
                }
                else if(arr[mid]>target)
                {
                    if(isAsc) {
                        end = mid - 1;
                    }
                    else
                    {
                        start=mid+1;
                    }
                }
                else {
                    if(isAsc) {
                        start = mid + 1;
                    }
                    else {
                        end=mid-1;
                    }
                }
            }
            return -1;
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
