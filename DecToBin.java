import java.util.Scanner;

public class DecToBin {
    public static void convert(int n){
        if(n<2){
            System.out.print(n);
            return;
        }
        convert(n/2);
        System.out.print(n%2);
        return;
    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        convert(n);
    }
}
