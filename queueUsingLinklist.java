import java.util.LinkedList;

public class queueUsingLinklist {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addLast(10);
        queue.addLast(13);
        queue.addLast(12);
        queue.addLast(11);
        queue.addLast(20);
        System.out.println(queue);
        System.out.println(queue.removeFirst());
    }
}
