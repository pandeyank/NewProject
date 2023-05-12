package LinkedlistExcersice;

import java.util.HashSet;

public class DemoExam {
    public static void main(String[] args) {
        int arr[]={1,2,5,1,2,6,8};
        HashSet<Integer> hs=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(arr[i]))
            {
                hs.add(arr[i]);
            }
            else {
                continue;
            }
        }
        System.out.println(hs);
    }
}
