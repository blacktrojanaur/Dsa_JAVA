import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>(10);

        list.add(21);
        list.add(29);
        list.add(67);
        list.add(45);
        list.add(21);
        list.add(29);
        list.add(67);
        list.add(45);
        list.add(21);
        list.add(29);
        list.add(67);
        list.add(45);
        System.out.println(list.contains(21));
        System.out.println(list);
        list.set(0, 99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        for( int i=0;i<5;i++){
            System.out.println(list.get(i));
        }



    }
}
