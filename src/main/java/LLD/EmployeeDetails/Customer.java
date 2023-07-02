package LLD.EmployeeDetails;

public class Customer {
    private String cust_name;
    private int cust_num;
    public Customer(String name,int number)
    {
        this.cust_name=name;
        this.cust_num=number;

    }
    public String getCust_name()
    {
        return cust_name;

    }

    public int getCust_num() {
        return cust_num;
    }


}
