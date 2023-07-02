package LLD.EmployeeDetails;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CustomerDetails {
    public static void main(String[] args) {

        HashMap<Integer, Customer> hm = new HashMap<>();
        hm.put(101,new Customer("Govind",12234456));
        hm.put(102,new Customer("Ravi",2345678));
        hm.put(103,new Customer("Dhoni",89673421));
        hm.put(108,new Customer("Prasad",67543290));
        hm.put(107,new Customer("Aman",87423218));
        Iterator<Integer> itr= hm.keySet().iterator();

        while(itr.hasNext()){
            int key = itr.next();
            Customer customer = hm.get(key);
            System.out.println("key is " +key + " " + "customer name is " +customer.getCust_name() + " " + "customer number is " +customer.getCust_num());
        }

    }
}