package _5_BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
        int[]arr={7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(arr,k));
    }
    public static int splitArray(int[] nums, int k) {
       int start=0;
       int end=0;
        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]); // ini the end of the loop it will contain the loop
            end+=nums[i];
        }
        //binary search
        while(start<end)
        {
            //try for the middle as potential answer
            int mid = start+(end-start)/2;

            //calculate how many pieces you can divide with max sum
            int sum=0;
            int pieces=1;
            for(int num : nums)
            {
                if(sum+num>mid)
                {
                    //you cannot add this in the sub array, make new one
                    //say you add this num in new subArray
                    sum=num;
                    pieces++;
                }
                else {
                    sum += num;
                }
            }
            if(pieces>k)
            {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return end;
    }
}
