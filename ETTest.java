public class ETTest {
    void delete(int a[],int x){
        for (int i = x; i <a.length-1 ; i++) {
            a[i] = a[i+1];
        }
        a[a.length-1]= 0;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
    void add(int a[],int x,int e){
        for (int i = a.length-1; i > x; i--) {
            a[i] = a[i-1];
        }
        a[x]=e;
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }
    }
}

class Final4{
    public static void main(String[] args) {
        int a[]= {10,20,30,40,50};
        int x = 1;
        int e=100;
        ETTest obj = new ETTest();
        obj.delete(a,x);
        obj.add(a,x,e);
    }
}
