import java.util.PriorityQueue;

// import java.util.HashMap;
// import java.util.Map;

public class test {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(3);
        pq.add(15);
        pq.add(66);
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        // Map<Integer, String> map = new HashMap<>();
        // map.put(0, "first");
        // map.put(13, "third");
        // map.put(2, "second");
        // for (String s : map.values()) {
        //     System.out.println(s);
        // }
        // System.out.println(5 % 2);
        // System.out.println(5 % (-2));
        // System.out.println(-5 % 2);
        // System.out.println((-5) % 2);
    }
}