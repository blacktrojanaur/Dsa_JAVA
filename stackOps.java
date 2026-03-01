import java.util.*;

public class stackOps {
    public static void main(String[] args) {
        Stack<Integer> st  = new Stack<>();

        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        st.push(12);
        st.push(14);
        st.push(16);

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());

    }
}
