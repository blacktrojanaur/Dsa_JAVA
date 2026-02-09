public class PrintIncrease {
    public static void main(String[] args) {
        PrintIncrease(7);
    }
    static void PrintIncrease(int n){
        if (n==0){
            return;
        }
        PrintIncrease(n-1);
        System.out.println(n);
    }
}
