package _5_BinarySearch;

public class MedianofArrays {
    public static void main(String[] args) {
        int []nums1={1,2};
        int []nums2={3,4};
        System.out.println(findMedian(nums1,nums2));
    }
    public static double findMedian(int[]nums1,int[]nums2)
    {
        int n1=nums1.length;
        int n2=nums2.length;
        int[]merged=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(nums1[i]<nums2[j])
            {
                merged[k++]=nums1[i];
                i++;
            }else
            {
                merged[k++]=nums2[j];
                j++;
            }
        }
        while(i<n1)merged[k++]=nums1[i++];
        while(j<n2)merged[k++]=nums2[j++];
        int mid=merged.length/2;
        double res=(mid%2==1)?(double)merged[mid]:(double)(merged[mid]+merged[mid-1])/2;
        return res;
    }
}
