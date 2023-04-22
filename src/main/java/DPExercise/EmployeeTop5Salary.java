package DPExercise;

import java.util.Arrays;
import java.util.Comparator;

class temp
{
    String name;
    double sal;
}
public class EmployeeTop5Salary {
    public static void main(String[] args) {
        String[] name={"Paras","Mehta","Mohan","Balaji","Mudit","X","Y"};
        double[] salary={2000,5876,38909,789234,89012,2300,3402};
        int n=name.length;
        temp[] arr=new temp[n];
        for(int i=0;i<n;i++)
        {
            temp x=new temp();
            x.name=name[i];
            x.sal=salary[i];
            arr[i]=x;
        }
        System.out.println("Heloo");
        Arrays.sort(arr, new Comparator<temp>() {
            @Override
            public int compare(temp o1, temp o2) {
                return Double.compare(o2.sal,o1.sal);
            }
        });
        for (int i=0;i<5;i++)
        {
            System.out.print(arr[i].name +" "+ arr[i].sal);
            System.out.println();
        }

    }
}
