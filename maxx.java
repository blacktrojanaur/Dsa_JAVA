import java.util.Scanner;

public class maxx {
    public static void main(String[] args) {
        maxx();
    }
    public static void maxx() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();

        }
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
        }
        System.out.println(max);
    }
    }