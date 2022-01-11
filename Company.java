import java.util.Scanner;

public class Company {
    int pro[]=new int[3];
    Company(int n){
        System.out.println("Enter the sales of 3 items sold by salesman "+n+": ");
        Scanner cin=new Scanner(System.in);
        for(int i=0;i<3;i++){
            pro[i]=cin.nextInt();
        }
    }
}

class Final2{
    public static void main(String[] args) {
        int c[]=new int[3];
        int s;
        Company a[]= new Company[5];
        for(int i=0;i<5;i++){
            a[i]=new Company(i+1);
        }
        for(int i=0;i<5;i++){
            s=0;
            for(int j=0;j<3;j++){
                s=s+a[i].pro[j];
            }
            System.out.println("Total Sales by Salesman "+i+1+" = "+s);
        }
        for(int i=0;i<3;i++){
            s=0;
            for(int j=0;j<5;j++){
                s=s+a[j].pro[i];
            }
            System.out.println("Total Sales of item "+i+1+" = "+s);
        }
    }
}
