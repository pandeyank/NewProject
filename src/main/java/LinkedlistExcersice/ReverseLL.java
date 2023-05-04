package LinkedlistExcersice;

public class ReverseLL extends printAllNode {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node h=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        /*
        int B=2;
        int C=4;
        int k=B-C+1;
        int i=1;
        Node temp=h;
        Node rh=null;
        while (i<B)
        {
            temp=temp.next;
            i++;
        }
        Node th=temp;
        while(k>0)
        {
            th=th.next;
            temp.next=rh;
            rh=temp;
            temp=temp.next;
            k--;
        }*/
        Node rh=null;
        Node temp=h;
        while (h!=null)
        {
            temp=h;
            h=h.next;
            temp.next=rh;
            rh=temp;

        }
        while (rh!=null)
        {
            System.out.print(rh.data +" ");
            rh=rh.next;
        }





        //System.out.println(rh.data );
        System.out.println("Exit");




    }
}
