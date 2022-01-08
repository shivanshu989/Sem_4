import java.util.Scanner;

public class Employee {
    String name;
    int id;
    int sal;
    Employee(){
        Scanner cin=new Scanner(System.in);
        name=cin.nextLine();
        id=cin.nextInt();
        sal=cin.nextInt();
    }
}

class Next{
    public static void main(String[] args) {
        Employee a[]=new Employee[10];
        for(int i=0;i<a.length;i++){
            a[i]=new Employee();
        }
        int x=a[0].sal;
        int f=0;
        for(int i=1;i<a.length;i++){
            if(a[i].sal>x){
                x=a[i].sal;
                f=i-1;
            }
        }
        System.out.println(a[f].name+" "+a[f].id+" "+a[f].sal);
    }
}
