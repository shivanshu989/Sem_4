import java.util.Scanner;

class PriorityNode{
    int data;
    int priority;
    PriorityNode next;
    PriorityNode(int data,int priority){
        this.data=data;
        this.priority=priority;
    }
}

public class PriorityQueue {
    PriorityNode front=null;
    PriorityNode rear=null;
    public void insert(int data,int priority){
        PriorityNode element=new PriorityNode(data,priority);
        if(front==null){
            front=rear=element;
        }
        else if(front.priority> element.priority){
            element.next=front;
            front=element;
        }
        else{
            PriorityNode temp=front;
            while(temp.next!=null){
                if(temp.priority>element.priority){
                    break;
                }
                else{
                    temp=temp.next;
                }
            }
            if(temp.next==null){
                rear=element;
            }
            element.next=temp.next;
            temp.next=element;
        }
    }
    public void display(){
        PriorityNode temp=front;
        while(temp!=null){
            System.out.println(temp.data+" "+ temp.priority);
            temp=temp.next;
        }
    }
}

class Final11{
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        PriorityQueue first=new PriorityQueue();
        int n=cin.nextInt();
        for(int i=0;i<n;i++){
            first.insert(cin.nextInt(),cin.nextInt());
        }
        first.display();
    }
}
