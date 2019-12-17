import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = nums.length - 1;
                int sum = 0 - nums[i];
                while (left < right) {
                    if (sum == nums[left] + nums[right]) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left += 1;
                        while (left < right && nums[right] == nums[right - 1]) right -= 1;
                        left += 1;
                        right -= 1;
                    } else if (nums[left] + nums[right] < sum) {
                        left += 1;
                    } else {
                        right -= 1;
                    }
                }
            }
        }

        return res;
    }
}