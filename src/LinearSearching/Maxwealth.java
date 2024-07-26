package LinearSearching;

public class Maxwealth {
    private static int maximumWealth(int[][] accounts)
    {
        int maxsum=Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            if (sum > maxsum) maxsum=sum;
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int[][]accounts={
                {23,43,54,54},
                {34,67,809,67},
                {33,123,23,90,76}
        };
        System.out.println(maximumWealth(accounts));
    }
}
