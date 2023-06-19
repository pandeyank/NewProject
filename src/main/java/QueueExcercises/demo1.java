package QueueExcercises;

public class demo1 {
    public static void main(String[] args) {
         int x = -123;
        //Output: 321
        reverseNumber(x);
    }

    private static void reverseNumber(int x) {
        String res="";
        boolean negative=false;
        if(x<0)
        {

            negative=true;
            x=(-1) * x;
        }
        while(x>0)
        {
            int rem=x%10;
            x=x/10;
            res+=String.valueOf(rem);

        }
        for(int i=0;i<res.length();i++)
        {
            System.out.print(res.charAt(i) +" ");
        }
        int ans=Integer.parseInt(res);
        if(negative==true)
        {
           ans=(-1) * ans;
        }
        System.out.println(ans);


    }
}
