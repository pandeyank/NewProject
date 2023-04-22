package org.example;

public class demo33 {
    public static void main(String[] args) {
        int [] prices = {8,4,6,2,3};
        int n=prices.length;
        int[] res=new int[n];
        int q=0;
        for(int i=0;i<n-1;i++)
        {
            int max=prices[i];
            for(int j=i+1;j<n;j++)
            {
                if(max>prices[j])
                {
                    max=max-prices[j];
                    res[q++]=max;
                    break;
                }

            }
        }
        if(prices[n-2]<prices[n-1])
        {
            res[q++]=prices[n-2];
            res[q]=prices[n-1];
        }
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i] +" ");
        }
    }
}
