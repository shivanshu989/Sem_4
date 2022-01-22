import java.util.Scanner;

public class RecPow {
    static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }

    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);
        int x=cin.nextInt();
        int n= cin.nextInt();
        System.out.println(pow(x,n));
    }
}
