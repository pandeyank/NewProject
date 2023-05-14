package StackExcercises;

public class stackImplementation1 {
    static class Stack
    {
        int data;
        Stack next;
        int cnt;
        Stack()
        {

            next=null;
            cnt=0;
        }
        Stack head;

        public void push(int i) {
            Stack nn=new Stack();
            nn.data=i;
            if(head==null)
            {

                head=nn;
                cnt++;
            }
            else {
                nn.next=head;
                head=nn;
                cnt++;
            }


        }

        public void display() {
            Stack temp=head;
            if (head==null)
            {

                System.out.println("Stack is empty:");
            }
            else
            {
                while (temp!=null)
                {

                    System.out.print(temp.data +" ");
                    temp=temp.next;
                }
            }
            System.out.println("The count is:" +cnt);

        }

        public void pop() {
            if(head==null)
            {
                System.out.println("Stack is underflow:");
            }
            else {
                int x= head.data;
                head=head.next;
                cnt--;
                System.out.println(x);

            }

        }

        public void peek() {
            if(head==null)
            {
                System.out.println("Stack is no peek:");
            }
            else {
                System.out.println("The peek is:" +head.data);
            }
        }

        public void size() {
            System.out.println("The size is:" +cnt);
        }
    }

    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        System.out.println();
        System.out.println("------->");
        st.pop();
        st.pop();
        st.peek();
        st.display();
        st.size();

    }
}
