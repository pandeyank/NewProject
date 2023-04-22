package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class demo37 {
    public static void main(String[] args) {
        //A = [1, 2, 3, 4, 5]
        //B = 10
        int [] a={5, 10, 20, 100, 105};
        int n=a.length;
        int b=130;
        int pos=0;
        for(int i=0;i<n;i++)
        {
            int ans=0;
            for(int j=i;j<n;j++)
            {
                if(a[j]+ans<b)
                {
                    ans=ans+a[j];
                    pos=Math.max(pos,j-i);
                }
            }
        }
        System.out.println(pos);



    }
}
