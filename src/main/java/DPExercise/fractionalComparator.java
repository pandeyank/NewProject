package DPExercise;

import java.util.Arrays;
import java.util.Comparator;

class Employee
{
    String name;
    double salary;
}

public class fractionalComparator {
    public static void main(String[] args) {
        String[] name = {"Aman", "Shyam", "Tom", "Bob", "Pankaj"};
        double[] salary = {1000.23, 50000, 6565, 3892, 100010};
        int n = name.length;
        Employee[] emp = new Employee[n];
        for (int i = 0; i < n; i++) {
            Employee x = new Employee();
            x.name = name[i];
            x.salary = salary[i];
            emp[i] = x;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(emp[i].name + " " + emp[i].salary);
            System.out.println();

        }


        Arrays.sort(emp, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Double.compare(o2.salary, o1.salary);
            }
        });
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.print(emp[i].name + " " + emp[i].salary);
            System.out.println();

        }

    }
}
