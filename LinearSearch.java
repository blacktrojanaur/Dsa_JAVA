import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[]arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
        int target=in.nextInt();
        int ans = linear(arr,target);
        System.out.println(ans);
    }static int linear(int[]arr, int target){
        if (arr.length== 0){
            return -1;
        }
        for (int i = 0 ; i< arr.length;i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
     return -1 ;
    }
}
