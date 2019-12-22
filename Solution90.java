import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution90 {
    public List<List<Integer>> subsetWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, 0, res, new ArrayList<>());
        return res;
    }

    public void helper(int[] nums, int pos, List<List<Integer>> res, List<Integer> temp) {
        if (pos <= nums.length) res.add(new ArrayList<>(temp));

        for (int i = pos; i < nums.length; i++) {
            if (i > pos && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            helper(nums, i + 1, res, temp);
            temp.remove(temp.size() - 1);
        }
    }
}