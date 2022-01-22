public class RecFind {
    public static int find(int arr[],int currentIndex,int search_value){
        if(arr[currentIndex]==search_value){
            return currentIndex;
        }
        return find(arr,currentIndex+1,search_value);
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,2,6};
        System.out.println(find(arr,0,2));
    }
}
