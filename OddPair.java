import java.util.Scanner;

public class OddPair {
    void check(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if((a[i]*a[j])%2!=0){
                    System.out.println(a[i]+" * "+a[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner cin= new Scanner(System.in);
        n= cin.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]= cin.nextInt();
        }
        OddPair obj=new OddPair();
        obj.check(a);
    }
}
