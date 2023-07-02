package SortingTechniques;

import java.lang.reflect.Array;

public class merge2sortedarray {
    public static void main(String[] args) {
        int[] a={7,10,11,14};
        int[] b={3,8,9};
        int[] p=new int[a.length+b.length];
        p=merge(a,b);
        for(int i=0;i<p.length;i++)
        {
            System.out.print(p[i] +" ");
        }
    }

    private static int[] merge(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        int []c=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m)
        {
            if(a[i]<b[j])
            {
                c[k++]=a[i++];
            }
            else {
                c[k++]=b[j++];
            }
        }
        while(i<n)
        {
            c[k++]=a[i++];
        }
        while(j<m)
        {
            c[k++]=b[j++];
        }
        return c;
    }
}
