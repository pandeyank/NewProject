package LLD.executors;

public class Merge2Sorted {
    public static void main(String[] args) {
        int[] a={7,10,11,14};
        int[] b={3,8,9};
        merge(a,b);

    }

    private static void merge(int[] a, int[] b) {
        int n=a.length;
        int m=b.length;
        int[] c=new int[n+m];
        int i=0;
        int k=0;
        int j=0;
        while (i<n && j<m)
        {
            if(a[i]<b[j])
            {
                c[k++]=a[i++];
            }
            else {
                c[k++]=b[j++];
            }
        }
        while (i<n)
        {
            c[k++]=a[i++];
        }
        while(j<m)
        {
            c[k++]=b[j++];
        }
        for(int s=0;s<c.length;s++)
        {
            System.out.print(c[s] +" ");
        }
    }


}
