package org.example;

public class demo51 {
    public static void main(String[] args) {
        int arr[]={3,7,4,5,2};
        int n=arr.length;
        int p1=0;
        int p2=n-1;
        int ans=0;
        while(p1<p2)
        {
            int min=Math.min(arr[p1],arr[p2]);
            int width=p2-p1;
            int area=1;
            if(min==arr[p1])
            {
                area=min*width;
                p1++;
            }
            else {
                area=min*width;
                p2--;
            }
            ans=Math.max(ans,area);

        }
        System.out.println(ans);

    }
}
