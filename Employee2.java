import java.util.Scanner;

public class Employee2 {
    String fname;
    String lname;
    String area;
    String city;
    String state;
    int emp_id;
    int salary;
    int desig;

    public Employee2() {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter name of employee:");
        fname= cin.nextLine();
        fname= cin.nextLine();
        System.out.println("Enter address of employee:");
        area= cin.nextLine();
        city= cin.nextLine();
        state= cin.nextLine();
        System.out.println("Enter employee id:");
        emp_id= cin.nextInt();
        System.out.println("Enter salary of employee:");
        salary= cin.nextInt();
        System.out.println("Enter Designation of employee:");
        desig= cin.nextInt();
    }
}

class Final6{
    public static void main(String[] args) {
        Employee2 a[]=new Employee2[5];
        for(int i=0;i<a.length;i++){
            a[i]=new Employee2();
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i].fname+" "+a[i].lname+"\n"+a[i].area+", "+a[i].city+", "+a[i]+"\n"+a[i].emp_id+"\n"+a[i].salary+"\n"+a[i].desig);
        }
    }
}
