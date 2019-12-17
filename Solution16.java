import java.util.Arrays;

public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];

        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1;
            int hi = nums.length - 1;

            while (lo < hi) {
                int curr = nums[i] + nums[lo] + nums[hi];
                if (curr > target) hi -= 1;
                else lo += 1;
                if (Math.abs(result - target) > Math.abs(curr - target)) {
                    result = curr;
                }
            }
        }

        return result;
    }
}