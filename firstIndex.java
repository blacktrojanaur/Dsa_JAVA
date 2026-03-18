public class firstIndex {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        int n = 5;
        System.out.println(firstIndex(arr,n,0));
    }
    public static int firstIndex(int[]arr,int n,int i){
       if (i == arr.length){
           return -1;
       }

        if (arr[i] == n) {
            return i ;

        }
         else {
             int idx = firstIndex(arr,n ,i+1);
             return idx;
        }
        
    }
}
