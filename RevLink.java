import java.util.Scanner;

class LinkedList4{
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
    public void revPrint(Node temp){
        if(temp.next==null){
            System.out.print(temp.data+" ");
            return;
        }
        revPrint(temp.next);
        System.out.print(temp.data+" ");
        return;
    }
}

public class RevLink {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        for(int x=0;x<t;x++){
            int data=0;
            LinkedList4 list=new LinkedList4();
            while(data!=-1){
                data= cin.nextInt();
                if(data!=-1){
                    list.insert(data);
                }
                else{
                    break;
                }
            }
            list.revPrint(list.head);
        }
    }
}
