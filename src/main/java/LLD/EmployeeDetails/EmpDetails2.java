package LLD.EmployeeDetails;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmpDetails2 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee(101,"Dravid",450));
        al.add(new Employee(105,"Dhoni",9000));
        al.add(new Employee(109,"Virat",1708));
        al.add(new Employee(111,"Gautam",1900));
        al.add(new Employee(113,"Bala ji",8098));
        System.out.println("Enter the number you want:");
        Collections.sort(al);
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        System.out.println("Top "+n+" salary is:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee id:" +al.get(i).getEmpid() +" Employee name:" +al.get(i).getEmpname() +" Employee Salary is:" +al.get(i).getEmpsal());
        }
    }
}
