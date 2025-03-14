package DynamicProgramming;

public class NinjaTraining {
    public static void main(String[] args) {
          int ind=3;
          int[][]points={{10,40,70}, {20,50,80}, {30,60,90}};
        System.out.println(maxPoints(ind-1,points,3));
    }
    public static int maxPoints(int ind,int[][]points,int last)
    {
        if(ind==0)
        {
            int max=0;
            for (int i = 0; i < 3; i++) {
                if(i!=last)
                {
                    max=Math.max(max,points[0][i]);
                }
            }
            return max;
        }
        int max=0;
        for (int i = 0; i < 3; i++) {
            if(i!=last)
            {
                int curPoint=points[ind][i]+maxPoints(ind-1,points,i);
                max=Math.max(curPoint,max);
            }
        }
        return max;
    }
}
