import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a;
        String b;
        Scanner cin=new Scanner(System.in);
        a=cin.nextLine();
        b=cin.nextLine();
        char x[]=a.toCharArray();
        char y[]=b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        int m=a.length();
        int n=b.length();
        int f=1;
        if(m==n){
            for(int i=0;i<m;i++){
                if(x[i]==y[i]){
                    continue;
                }
                else{
                    f=0;
                    break;
                }
            }
            if(f==1){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
        else
            System.out.println("Not Anagram");
    }
}
