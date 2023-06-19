package QueueExcercises;

import java.util.LinkedList;
import java.util.Queue;
public class perfectNumbers {
    static Queue<String> q=new LinkedList<>();
    public static void main(String[] args) {
        int A=9;
        perfect(A);
    }

    private static void perfect(int a) {
        q.add("1");
        q.add("2");
        for(int i=0;i<a;i++) {
            String ele = q.remove();
            int n = ele.length();
            if (n % 2 == 1) {
                int stringIndex = n / 2;
                String p = String.valueOf(ele.charAt(stringIndex));
                String res = ele.substring(0, stringIndex) + p + ele.substring(stringIndex);
                q.add(res);
            }
            else
            {
                int stringIndex= n/2;
                //String p=String.valueOf(ele.charAt(stringIndex));
                String res1=ele.substring(0,stringIndex) + "1" + ele.substring(stringIndex);
                String res2=ele.substring(0,stringIndex) + "2" + ele.substring(stringIndex);
                q.add(res1);
                q.add(res2);
            }


        }
        System.out.println(q.peek());
    }
}
