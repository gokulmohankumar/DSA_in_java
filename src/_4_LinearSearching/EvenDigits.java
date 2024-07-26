package _4_LinearSearching;

public class EvenDigits {
    private static int evenDigitsinArray(int[]arr)
    {
        int count=0;
        for (int num:arr) {
            int digits=findNoOfDigits(num);
            if(digits%2==0) count++;
        }
      return count;
    }
    private static int findNoOfDigits(int num) {
        if(num<0)num=num*-1;
        return (int)Math.log10(num)+1;
    }
    public static void main(String[] args) {
        int[]nums={12,1,34,567,876,-12,-3,-7687};
        System.out.println(evenDigitsinArray(nums));
    }
}
