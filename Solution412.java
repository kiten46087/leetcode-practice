import java.util.List;
import java.util.ArrayList;
public class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        int fizz = 0;
        int buzz = 0;
        for (int i = 0; i <= n; i++) {
            fizz += 1;
            buzz += 1;
            if (fizz == 3 && buzz == 5) {
                res.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            } else if (fizz == 3) {
                res.add("Fizz");
                fizz = 0;
            } else if (buzz == 5) {
                res.add("Buzz");
                buzz = 0;
            } else {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}