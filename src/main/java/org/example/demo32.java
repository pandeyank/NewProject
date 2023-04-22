package org.example;

public class demo32 {
    public static void main(String[] args) {
        //
        // startTime = [1,2,3], endTime = [3,2,7], queryTime = 4
        int startTime[]={1,2,3};
        int endTime[]={3,2,7};
        int queryTime=4;
        int n=startTime.length;
        int diff=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            diff=endTime[i]-startTime[i];
            if(diff==queryTime)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
