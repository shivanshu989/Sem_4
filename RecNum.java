import java.util.Scanner;

public class RecNum {
    static void num(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        num(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner cin= new Scanner(System.in);
        int n= cin.nextInt();
        num(n);
    }
}
