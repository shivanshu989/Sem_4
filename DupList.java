import java.util.Scanner;

class LinkedList2{
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
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void remDup(){
        Node x=head;
        Node y=x.next;
        int f=x.data;
        while(y!=null){
            if(y.data==f){
                x.next=y.next;
            }
            else{
                f=y.data;
                x=y;
            }
            y=x.next;
        }
    }
}

public class DupList {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        LinkedList2 first=new LinkedList2();
        for(int i=0;i<10;i++){
            first.insert(cin.nextInt());
        }
        first.remDup();
        first.display();
    }
}
