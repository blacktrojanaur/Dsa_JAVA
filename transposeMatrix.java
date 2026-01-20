import java.util.Arrays;

public class transposeMatrix {
    public static void main(String[] args) {
      int [][]arr= {{1,2,3,4},
              {12,13,14,15},
              {16,17,18,19},
              {20,21,22,22}};
        trans(arr);
    }
        public static void trans(int [][]arr){

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < i; j++) {
                    int temp = arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;

                }

            }

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+  " ");


                }
                System.out.println();
            }
        }
    }

