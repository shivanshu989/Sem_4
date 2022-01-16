import java.util.Scanner;

public class Flower {
    String name;
    int petals;
    float price;
    Flower(){
        name="Flower";
        petals=0;
        price=0;
    }
    void set(){
        Scanner cin=new Scanner(System.in);
        name= cin.nextLine();
        petals= cin.nextInt();
        price= cin.nextFloat();
    }
    void get(){
        System.out.println(name);
        System.out.println(petals);
        System.out.println(price);
    }
}

class Final1{
    public static void main(String[] args) {
        Flower a[]=new Flower[5];
        for(int i=0;i<5;i++){
            a[i]=new Flower();
            a[i].set();
        }
        for(int i=0;i<5;i++){
            a[i].get();
        }
    }
}
