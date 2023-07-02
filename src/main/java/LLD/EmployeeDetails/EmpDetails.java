package LLD.EmployeeDetails;

import java.util.ArrayList;
import java.util.Iterator;

public class EmpDetails {
    public static void main(String[] args) {
        ArrayList<Employee> al=new ArrayList<>();
        al.add(new Employee(101,"Dhoni",1000));
        al.add(new Employee(105,"Yuvraj",20000));
        al.add(new Employee(107,"Dhawan",50000));
        al.add(new Employee(109,"Saurab",70000));
        al.add(new Employee(110,"Virat",60000));
        Iterator<Employee> itr=al.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
