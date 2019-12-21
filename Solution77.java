import java.util.ArrayList;
import java.util.List;

public class Solution77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k > n || k < 0) return result;
        if (k == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }

        result = combine(n - 1, k - 1);
        for (List<Integer> list : result) {
            list.add(n);
        }
        result.addAll(combine(n - 1, k));
        return result;
        // List<List<Integer>> res = new ArrayList<>();
        // helper(res, new ArrayList<>(), 0, n, k);
        // return res;
    }

    // public void helper(List<List<Integer>> res, List<Integer> temp, int start, int n, int k) {
    //     if (k == 0) {
    //         res.add(new ArrayList<>(temp));
    //         return;
    //     }

    //     for (int i = start; i <= n; i++) {
    //         temp.add(i);
    //         helper(res, temp, i + 1, n, k - 1);
    //         temp.remove(temp.size() - 1);
    //     }
    // }
}