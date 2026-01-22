import java.util.Scanner;
public class binarySearch {

        

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input array size
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            // Input sorted array
            System.out.println("Enter sorted elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Input target element
            System.out.print("Enter element to search: ");
            int key = sc.nextInt();

            int result = binarySearch(arr, key);

            if (result == -1)
                System.out.println("Element not found");
            else
                System.out.println("Element found at index: " + result);
        }

        static int binarySearch(int[] arr, int key) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == key)
                    return mid;   // Element found

                if (arr[mid] < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return -1; // Element not found
        }
    }



