import java.util.Scanner;

public class RepEle {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n= cin.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int f;
        for(int i=0;i<n;i++){
            a[i]= cin.nextInt();
        }
        int x=0;
        for(int i=0;i<n;i++){
            f=1;
            for(int j=0;j<x;j++){
                if(a[i]==b[j]){
                    f=0;
                    break;
                }
            }
            if(f==1){
                b[x]=a[i];
                x++;
            }
        }
        for(int i=0;i<x;i++){
            System.out.println(b[i]);
        }
    }
}
