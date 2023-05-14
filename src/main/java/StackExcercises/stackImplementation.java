package StackExcercises;



public class stackImplementation {
    static class Stack
    {
        int data;
        Stack next;
        int size;
        int cnt;


        Stack()
        {

            next=null;
            cnt=0;

        }
        Stack head;
        public void push(int i) {
            Stack temp=new Stack();
            temp.data=i;
            if(head==null)
            {
                head=temp;
                cnt++;
            }
            else {
                temp.next=head;
                head=temp;
                cnt++;
            }
        }

        public void display() {
            if(head==null)
            {
                System.out.print("Stack Underflow "  );
            }
            else {
                Stack nn=head;
                while (nn!=null)
                {
                    System.out.print(nn.data +" ");
                    nn=nn.next;

                }
            }
            System.out.println();
            System.out.println("Count is :" +cnt);
        }

        public int pop() {
            if(head==null)
            {
                return -1;
            }
            else {
                int val=head.data;
                head=head.next;
                cnt--;
                return val;
            }

        }

        public int peek() {
            if(head==null)
            {
                return -1;
            }
            else {
                int x=head.data;
                return x;
            }
        }

        public int size() {
            return cnt;
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(8);
        st.display();
        int x=st.pop();
        System.out.println(x);
        int y=st.pop();
        System.out.println(y);
        System.out.println("----------->");
        st.display();
        System.out.println("The peek element in the stack is:" +st.peek());
        System.out.println("The size in the stack is:" +st.size());
        st.push(18);
        st.push(30);
        st.display();
        System.out.println(st.peek());


    }
}
