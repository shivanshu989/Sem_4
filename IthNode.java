import java.util.Scanner;

public class IthNode {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t= cin.nextInt();
        for(int x=0;x<t;x++){
            int data=0;
            LinkedList newList=new LinkedList();
            while(data!=-1){
                data= cin.nextInt();
                if(data!=-1){
                    newList.insert(data);
                }
                else{
                    break;
                }
            }
            int i= cin.nextInt();
            newList.randomDisplay(i);
        }
    }
}
