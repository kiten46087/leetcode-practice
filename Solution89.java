import java.util.ArrayList;
import java.util.List;

public class Solution89 {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        for (int i = 0; i < n; i++) {
            int size = res.size();
            for (int k = size - 1; k >= 0; k--) {
                res.add(res.get(k) | 1 << i);
            }
        }
        return res;
    }
}