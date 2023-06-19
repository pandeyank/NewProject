package QueueExcercises;

public class sumOfMinMax {
    public static void main(String[] args) {
        int[]A = {2, 5, -1, 7, -3, -1, -2};
        int B = 4;
        minmax(A,B);
    }

    private static void minmax(int[] a, int b) {
        int n=a.length;

        for(int i=0;i<n-b+1;i++)
        {
            int min=a[i];
            int max=a[i];
            for(int j=i+1;j<i+b;j++)
            {
               if(a[j]<min)
               {
                   min=a[j];
               }
               if(a[j]>max)
               {
                   max=a[j];
               }


            }
            System.out.println(min+max);
        }
    }
}
