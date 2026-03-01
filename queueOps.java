import java.util.*;
public class queueOps {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);

        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        
    }
}
