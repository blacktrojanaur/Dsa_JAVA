import java.util.*;
public class stackUsingLinklist {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        stack.addLast(4);
        stack.addLast(5);
        System.out.println(stack.removeFirst());
    }
}
