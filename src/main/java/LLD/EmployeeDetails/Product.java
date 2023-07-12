package LLD.EmployeeDetails;

public class Product implements Comparable<Product> {
    private int pid;
    private String pname;
    private double price;
    Product(int pid,String pname,double price)
    {
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPid() {
        return pid;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {
        if(this.getPrice()<o.getPrice())
        {
            return 1;
        }
        else {
            return -1;
        }

    }
}
