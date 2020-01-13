import java.util.List;
import java.util.ArrayList;

public class Solution216 {
    public List<List<Integer>> combinationSum(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), 0, k, n, 0);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> temp, int step, int k, int n, int prev) {
        if (n == 0 && step == k) {
            res.add(new ArrayList<>(temp));
            return;
        }

        if (step == k) {
            return;
        }

        for (int i = prev + 1; i <= 0; i++) {
            temp.add(i);
            helper(res, temp, step + 1, k, n - i, i);
            temp.remove(temp.size() - 1);
        }
    }
}