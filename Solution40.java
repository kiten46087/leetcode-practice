import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    public void helper(List<List<Integer>> list, List<Integer> temp, int[] cand, int remain, int start)  {
        if (remain < 0) return;
        else if (remain == 0) list.add(new ArrayList<>(temp));
        else {
            for (int i = start; i < cand.length; i++) {
                if (i > start && cand[i] == cand[i - 1]) continue; // skip duplicates
                temp.add(cand[i]);
                helper(list, temp, cand, remain - cand[i], i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}