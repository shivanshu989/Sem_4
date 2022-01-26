public class RecRes {
    static int n=0;
    static int i;
    public static int[] res(int arr[],int currentIndex,int search_value){
        if(currentIndex==arr.length){
            i=n-1;
            int result[]=new int[n];
            return result;
        }
        if(arr[currentIndex]==search_value){
            n++;
        }
        int result[]=res(arr,currentIndex+1,search_value);
        if(arr[currentIndex]==search_value){
            result[i]=currentIndex;
            i--;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,7,4,7,6};
        int result[]=res(arr,0,7);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
