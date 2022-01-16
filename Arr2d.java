import java.util.ArrayList;
import java.util.Scanner;

public class Arr2d {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner cin= new Scanner(System.in);
        x= cin.nextInt();
        y= cin.nextInt();
        int a[][]=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.println("Enter value of a["+i+"]["+j+"]= ");
                a[i][j]= cin.nextInt();
            }
        }
        ArrayList<Integer>e=new ArrayList<Integer>();
        ArrayList<Integer>o=new ArrayList<Integer>();
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(a[i][j]%2==0){
                    e.add(a[i][j]);
                }
                else{
                    o.add(a[i][j]);
                }
            }
        }
        System.out.println("Even elements are: "+e);
        System.out.println("Odd elements are: "+o);
    }
}
