import java.util.Arrays;
import java.util.Scanner;

public class TimeInterval {
    int start;
    int end;
    TimeInterval(){
        Scanner cin=new Scanner(System.in);
        start= cin.nextInt();
        end= cin.nextInt();
    }
}

class Final7{
    public boolean canAttendMeeting(TimeInterval a[]){
        int start[]=new int[a.length];
        int end[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            start[i]=a[i].start;
            end[i]=a[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int f=1;
        for(int i=0;i<a.length-1;i++){
            if(end[i]>start[i+1]){
                f=0;
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TimeInterval a[]=new TimeInterval[5];
        for(int i=0;i<a.length;i++){
            a[i]=new TimeInterval();
        }
        Final7 obj=new Final7();
        System.out.println(obj.canAttendMeeting(a));
    }
}
