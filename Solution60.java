import java.util.List;
import java.util.ArrayList;

public class Solution60 {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        StringBuilder sb = new StringBuilder();

        // create the factorial loop up
        int sum = 1;
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            sum *= i;
            factorial[i] = sum;
        }
        // factorial[] = {1, 1, 2, 6, 24, ... n!}

        
        // create the list of numbers
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        k -= 1;

        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            sb.append(String.valueOf(numbers.get(index)));
            numbers.remove(index);
            k -= index * factorial[n - i];
        }

        return String.valueOf(sb);
    }
}