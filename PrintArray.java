public class PrintArray {
    public static void main(String[] args) {
          int [] arr={1,2,3,4,5,6};
          printArray(arr ,0);
    }
    static void printArray(int []arr, int inx ){
        if (inx ==arr.length ) {
               return;
        }
        System.out.print(arr[inx] +" ");
        
        printArray(arr,inx +1);

    }
}