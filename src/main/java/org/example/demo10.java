package org.example;

public class demo10 {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int [] height={180,165,170};
        int n=height.length;
        for(int i=0;i<n;i++)
        {
            int max=height[i];
            for (int j=i;j<n;j++)
            {
                if(max<height[j])
                {
                    max=height[j];
                }
                System.out.println(swapHeigt(height,i,j,max));
                //System.out.println(swapNames(names,i,j));
            }
        }
    }

    private static String[] swapNames(String[] names, int i, int j) {
        String temp=names[j];
        names[j]=names[i];
        names[i]=temp;
        return names;
    }

    private static int[] swapHeigt(int[] height, int i, int j, int max) {
        int temp=height[i];
        height[i]=max;
        height[j]=temp;
        return height;

    }
}
