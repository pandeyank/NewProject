package QueueExcercises;

public class demo2 {

    public static void main(String[] args) {
        /*Integer i = new Integer(10);
        Integer j = i;
        System.out.println(i==j);*/

        /*Integer i = new Integer(10);
        Integer j = new Integer(10);
        System.out.println(i==j);*/
        System.out.println(newmethod());

    }

    private static int newmethod() {
        try{
            //try block
            return 10;
        }
        catch(Exception ex){
            //catch block
            return 15;
        }
        finally{
            //finally block
            return 20;
        }

    }
}
