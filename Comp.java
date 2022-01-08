import java.util.Scanner;

public class Comp {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int m=cin.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=cin.nextInt();
        }
        int n=cin.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=cin.nextInt();
        }
        for(int i=0;i<m;i++){
            int s=0;
            for(int j=0;j<n;j++){
                if(a[i]==b[j])
                    s++;
            }
            if(s>1)
                System.out.println(a[i]);
        }
    }
}
