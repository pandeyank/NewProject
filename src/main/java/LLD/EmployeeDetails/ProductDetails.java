package LLD.EmployeeDetails;

import java.util.*;

public class ProductDetails {


    public static void main(String[] args) {
        Product p1=new Product(101,"Parle-G",10);
        Product p2=new Product(202,"Pepsi",46.80);
        Product p3=new Product(205,"Acer",9236);
        Product p4=new Product(107,"Tablet",12500);
        Product p5=new Product(215,"Pen",8);
        //System.out.println("Enter the number:");
        //Scanner scn=new Scanner(System.in);
        //int p=scn.nextInt();
        ArrayList<Product> al=new ArrayList<>();

        al.add(p1);
        al.add(p2);
        al.add(p3);
        al.add(p4);
        al.add(p5);
        Iterator<Product> itr=al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println();
        for(int i=0;i<al.size();i++)
        {
            System.out.println("Product id is:"+al.get(i).getPid() +" Product name is:" +al.get(i).getPname() +" Product price is:" +al.get(i).getPrice());
        }
        System.out.println();

        Collections.sort(al);

        System.out.println("Top two Product Higher in price are:");
        for(int i=0;i<2;i++)
        {
            System.out.println("Product id is:" +al.get(i).getPid() + " Product name is:" +al.get(i).getPname() +" Product price is:" +al.get(i).getPrice());
        }

    }
}
