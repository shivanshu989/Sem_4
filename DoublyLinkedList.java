import java.util.Scanner;

class Node2{
    int data;
    Node2 next;
    Node2 previous;
    Node2(int data){
        this.data=data;
    }
}

public class DoublyLinkedList {
    Node2 head;
    public void insert(int data){
        Node2 link=new Node2(data);
        if(head==null){
            head=link;
        }
        else{
            Node2 temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=link;
            link.previous=temp;
        }
    }
    public void display(){
        Node2 temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }public void revDisplay(){
        Node2 temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.previous;
        }
    }
}

class Final9{
    public static void main(String[] args) {
        DoublyLinkedList first=new DoublyLinkedList();
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        int a;
        for(int i=0;i<n;i++){
            a= cin.nextInt();
            first.insert(a);
        }
        first.revDisplay();
    }
}
