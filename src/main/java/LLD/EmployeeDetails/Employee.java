package LLD.EmployeeDetails;

public class Employee {
    private int empid;
    private String empname;
    private int empsal;
    public Employee(int id,String name,int sal)
    {
        this.empid=id;
        this.empname=name;
        this.empsal=sal;
    }
    public int getEmpid()
    {
        return empid;
    }
    public String getEmpname()
    {
        return empname;
    }
    public int getEmpsal()
    {
        return empsal;
    }

    @Override
    public String toString() {
        return ("Employee id is:" +empid +" Employee Name is:" +empname+ " Employee Salary is:" +empsal);
    }
}
