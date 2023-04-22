package org.example;

public class subarray {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {

                if((j-i+1)%2==1) {


                    for (int k = i; k <= j; k++) {
                        max+=arr[k];
                        System.out.print(arr[k] + " ");

                    }

                    System.out.println();
                }
            }

        }
        System.out.println(max);
    }
}
