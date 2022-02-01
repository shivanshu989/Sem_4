import java.util.Scanner;

public class RecRemove {
    static int n=1;
    static char c='0';
    public static char[] remove(char a[],int i){
        if(i==a.length){
            char b[]=new char[n];
            n--;
            c++;
            return b;
        }
        if(a[i]!=c){
            c=a[i];
            n++;
        }
        char b[]=remove(a,i+1);
        if(a[i]!=c){
            b[n]=a[i];
            n--;
            c=a[i];
        }
        return b;
    }
    public static void main(String[] args) {
        String a;
        Scanner cin=new Scanner(System.in);
        a=cin.nextLine();
        c=a.charAt(0);
        String b=new String(remove(a.toCharArray(),1));
        System.out.println(b);
    }
}
