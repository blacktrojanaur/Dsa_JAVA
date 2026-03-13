import java.util.*;

public class revQueue {

    public static void reverse(Queue<Integer> queue, int k) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < k; i++) {
            st.push(queue.remove());
        }

        for (int i = 0; i < k; i++) {
            queue.offer(st.pop());
        }

        int count = queue.size() - k;

        for (int i = 0; i < count; i++) {
            queue.offer(queue.remove());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        int k = 3;

        reverse(q, k);

        System.out.println(q);
    }
}