import java.util.Scanner;

public class RecSwap {
    static char[] swap(char ca[],char c1,char c2,int i){
        if(i==ca.length){
            return ca;
        }
        if(ca[i]==c1){
            ca[i]=c2;
        }
        return swap(ca,c1,c2,i+1);
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String s=cin.nextLine();
        char c1=cin.next().charAt(0);
        char c2=cin.next().charAt(0);
        char ca[]=s.toCharArray();
        s=new String(swap(ca,c1,c2,0));
        System.out.println(s);
    }
}
