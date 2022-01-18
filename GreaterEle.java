import java.util.Scanner;

public class GreaterEle {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        System.out.println("Enter size of 1st array:");
        int m= cin.nextInt();
        int a[]=new int[m];
        System.out.println("Enter elements of 1st array:");
        for(int i=0;i<m;i++){
            a[i]= cin.nextInt();
        }
        System.out.println("Enter size of 2st array:");
        int n= cin.nextInt();
        int b[]=new int[n];
        System.out.println("Enter elements of 2nd array:");
        for(int i=0;i<n;i++){
            b[i]= cin.nextInt();
        }
        int s=0;
        for(int i=0;i<m;i++){
            s=0;
            for(int j=0;j<n;j++){
                if(b[j]>=a[i]){
                    s++;
                }
            }
            System.out.print(s+" ");
        }
    }
}
