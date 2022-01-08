import java.util.Scanner;


public class Book {
    int id;
    String name;
    int page;
    int price;
    Book(){
        Scanner cin=new Scanner(System.in);
        name= cin.nextLine();
        id= cin.nextInt();
        page=cin.nextInt();
        price= cin.nextInt();
    }
}

class Final{
    public static void main(String[] args) {
        Book a[]=new Book[10];
        for(int i=0;i<a.length;i++){
            a[i]= new Book();
        }
        int x=a[0].price;
        int y=a[0].price;
        int h=0;
        int l=0;
        for(int i=1;i<a.length;i++){
            if(a[i].price>x){
                x=a[i].price;
                h=i;
            }
            else if(a[i].price<y){
                y=a[i].price;
                l=i;
            }
        }
        System.out.println(a[h].price-a[l].price);
        System.out.println(a[h].id+" "+a[h].name+" "+a[h].page+" "+a[h].price);
        System.out.println(a[l].id+" "+a[l].name+" "+a[l].page+" "+a[l].price);
    }
}
