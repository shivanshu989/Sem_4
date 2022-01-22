import java.util.Scanner;

public class RecArr {
    static int arr(int a[],int n){
        if(n==0){
            return a[0];
        }
        return a[n]+arr(a,n-1);
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n= cin.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= cin.nextInt();
        }
        System.out.println(arr(a,n-1));
    }
}
