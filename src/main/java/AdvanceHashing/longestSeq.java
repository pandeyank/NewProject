package AdvanceHashing;
import java.util.Arrays;
public class longestSeq {
    public static void main(String[] args) {
        int[] a={-1,8,5,3,10,2,4,9};
        int n=a.length;
        int max=1;
        int count=1;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i] +" ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++)
        {

            if(a[i]+1==a[i+1])
            {
                count++;

            }
            else if(a[i]==a[i+1])
            {
                continue;
            }
            else if(a[i]!=a[i+1])
            {
                max=count;
                count=1;
            }
        }
        System.out.println(max);

    }
}
