import java.util.Scanner;

public class ArrayDiv {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n= cin.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= cin.nextInt();
        }
        int b[]=new int[n];
        int x=0;
        int y=n-1;
        for(int i=0;i<n;i++){
            if(a[i]%5==0){
                b[y]=a[i];
                y--;
            }
            else{
                b[x]=a[i];
                x++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(b[i]);
        }
    }
}
