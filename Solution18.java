import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int lo = j + 1;
                int hi = nums.length - 1;
                while (lo < hi) {
                    if (nums[i] + nums[j] + nums[lo] + nums[hi] == target) {
                        List<Integer> temp = new LinkedList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[lo]);
                        temp.add(nums[hi]);
                        res.add(temp);
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo += 1;
                        while (lo < hi && nums[hi] == nums[hi - 1]) hi -= 1;
                        lo += 1;
                        hi -= 1;
                    } else if (nums[i] + nums[j] + nums[lo] + nums[hi] < target) {
                        lo += 1;
                    } else {
                        hi -= 1;
                    }
                }
            }
        }

        return res;
    }
}