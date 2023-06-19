package QueueExcercises;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FNRC {
    public static void main(String[] args) {
        String str="adadbc";
        firstnon(str);
    }

    private static void firstnon(String str) {
        int n=str.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else {
                hm.put(ch,1);
            }
            q.add(ch);
            while((q.size()>0)&&(hm.get(q.peek())>1))
            {
                q.poll();
            }
            if(q.size()==0)
            {
                sb.append('#');
            }
            if(q.peek()!=null)
            {
                sb.append(q.peek());
            }

        }

        System.out.println(sb);
    }
}
