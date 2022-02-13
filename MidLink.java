import java.util.Scanner;

class LinkedList3{
    Node head;
    public void insert(int data){
        Node link=new Node(data);
        if(head==null){
            head=link;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=link;
        }
    }
    public void midpoint(){
        int i=0;
        Node temp=head;
        while(temp!=null){
            i++;
            temp=temp.next;
        }
        temp=head;
        if(i==0){
            System.out.print("");
        }
        else{
            for(int j=0;j<(i/2)-1;j++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
    }
}

public class MidLink {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t= cin.nextInt();
        for(int x=0;x<t;x++){
            int data=0;
            LinkedList3 newList=new LinkedList3();
            while(data!=-1){
                data= cin.nextInt();
                if(data!=-1){
                    newList.insert(data);
                }
                else{
                    break;
                }
            }
            newList.midpoint();
        }
    }
}
