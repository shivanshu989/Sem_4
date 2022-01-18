import java.util.Scanner;

public class GameEntry {
    private int score;
    private String name;
    public GameEntry(int score,String name){
        this.score=score;
        this.name=name;
    }
    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
    public String toString(){
        return "("+score+","+name+")";
    }
}

class Final5{
    public static void main(String[] args) {
        GameEntry a[]=new GameEntry[5];
        int score;
        String name;
        int f;
        Scanner cin=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            score= cin.nextInt();
            cin.nextLine();
            name=cin.nextLine();
            a[i]=new GameEntry(score,name);
        }
        GameEntry temp;
        for(int i=0;i<a.length-1;i++){
            f=0;
            for(int j=0;j<a.length-i-1;j++){
                if(a[j].getScore()>a[j+1].getScore()){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    f=1;
                }
            }
            if(f==0){
                break;
            }

        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
