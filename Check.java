import java.util.Scanner;

public class Check {
    static int i=0;
    public static boolean member(int a[],int x){
        if(i==a.length){
            return false;
        }
        if(a[i]==x){
            return true;
        }
        i++;
        boolean temp=member(a,x);
        return temp;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,0};
        Scanner cin=new Scanner(System.in);
        int x= cin.nextInt();
        System.out.println(member(a,x));
    }
}
