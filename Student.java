import java.util.Scanner;

public class Student {
    private int rollno;
    private int marks;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public int getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }

    Student(){
        Scanner cin=new Scanner(System.in);
        name= cin.nextLine();
        rollno= cin.nextInt();
        marks= cin.nextInt();
    }
}

class Final3{
    public static void main(String[] args) {
        Student a[]=new Student[10];
        for(int i=0;i<10;i++){
            a[i]= new Student();
        }
        int max=a[0].getMarks();
        int min=a[0].getMarks();
        int x=0;
        int y=0;
        for(int i=1;i<10;i++){
            if(a[i].getMarks()>max){
                max=a[i].getMarks();
                x=i;
            }
            else if(a[i].getMarks()<min){
                min=a[i].getMarks();
                y=i;
            }
        }
        System.out.println("Student with maximum marks is: "+ a[x].getName() +" "+a[x].getRollno()+" "+a[x].getMarks());
        System.out.println("Student with minimum marks is: "+a[y].getName()+" "+a[y].getRollno()+" "+a[y].getMarks());
    }
}
