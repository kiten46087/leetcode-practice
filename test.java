import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "first");
        map.put(13, "third");
        map.put(2, "second");
        for (String s : map.values()) {
            System.out.println(s);
        }
    }
}