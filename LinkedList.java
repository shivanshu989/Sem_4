import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class LinkedList{
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
    public void randomDisplay(int i){
        Node temp=head;
        for(int j=0;j<i;j++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void random(int i, int data){
        Node link=new Node(data);
        if(i==0){
            link.next=head;
            head=link;
        }
        else{
            int x=0;
            Node temp=head;
            while(x<i-1 && temp.next!=null){
                temp=temp.next;
                x++;
            }
            link.next=temp.next;
            temp.next=link;
        }
    }
}

class Final8{
    public static void main(String[] args) {
        LinkedList first=new LinkedList();
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int a;
        for(int i=0;i<n;i++){
            a= cin.nextInt();
            first.insert(a);
        }
        first.random(cin.nextInt(),cin.nextInt());
        first.display();
    }
}
