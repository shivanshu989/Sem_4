import java.util.Scanner;

public class RecDigit {
    static void digit(int n,int i){
        if(n>0){
            digit(n/10,i+1);
        }
        else{
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        digit(n,0);
    }
}
