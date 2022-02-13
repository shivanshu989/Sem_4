class LinkedStack{
    Node top=null;
    public void push(int data){
        Node link=new Node(data);
        if(top==null){
            top=link;
        }
        else{
            link.next=top;
            top=link;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("Underflow");
        }
        else if(top.next==null){
            System.out.println(top.data);
            top=null;
        }
        else{
            System.out.println(top.data);
            top=top.next;
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        int s=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                s+=10;
                arr[i][j]=s;
            }
        }
        LinkedStack first=new LinkedStack();
        for(int i=0;i<3;i++){
            s=0;
            for(int j=0;j<3;j++){
                s+=arr[j][i];
            }
            first.push(s);
        }
        for(int i=0;i<3;i++){
            first.pop();
        }
    }
}
