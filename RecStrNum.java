import java.util.Scanner;

public class RecStrNum {
    static int n=0;
    public static int strnum(char a[],int i){
        if(i==a.length){
            return n;
        }
        n=(n*10)+(a[i]-'0');
        return strnum(a,i+1);
    }
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String a=cin.nextLine();
        System.out.println(strnum(a.toCharArray(),0));
    }
}
