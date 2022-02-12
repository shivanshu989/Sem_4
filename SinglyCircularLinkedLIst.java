import java.util.Scanner;

class Node3 {
    int data;
    Node3 next;
    Node3(int data){
        this.data=data;
    }
}

public class SinglyCircularLinkedLIst {
    Node3 head;
    public void insert(int data){
        Node3 link=new Node3(data);
        if(head==null){
            head=link;
            head.next=head;
        }
        else{
            Node3 temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=link;
            link.next=head;
        }
    }
    public void display(){
        System.out.println(head.data);
        Node3 temp=head.next;
        while(temp!=head){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public void random(int i, int data){
        Node3 link=new Node3(data);
        Node3 temp=head;
        if(i==0){
            while(temp.next!=head){
                temp=temp.next;
            }
            link.next=head;
            head=link;
            temp.next=link;
        }
        else{
            int x=0;
            while(x<i-1 && temp.next!=null){
                temp=temp.next;
                x++;
            }
            link.next=temp.next;
            temp.next=link;
        }
    }
}

class Final10{
    public static void main(String[] args) {
        SinglyCircularLinkedLIst first=new SinglyCircularLinkedLIst();
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
