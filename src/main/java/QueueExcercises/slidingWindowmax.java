package QueueExcercises;

public class slidingWindowmax {
    public static void main(String[] args) {
        int arr[]={10,1,9,3,7,6,5,11,8};
        int k=4;
        maxWnidow(arr,k);
    }

    private static void maxWnidow(int[] arr,int k) {
        int n=arr.length;
        int [] res=new int[n-k+1];

        for(int i=0;i<n-k+1;i++)
        {
            int start=i;
            int max=arr[i];
            int end=i+k;
            for(int j=start+1;j<end;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
            res[i]=max;
        }
        for (int i=0;i<res.length;i++)
        {
            System.out.print(res[i] +" ");
        }
    }
}
