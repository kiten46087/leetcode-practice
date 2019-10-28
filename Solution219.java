import java.util.HashSet;
import java.util.Set;

public class Solution219 {
    public boolean containsNearbyDuplication(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) set.remove(nums[i - k - 1]);
            if (!set.add(nums[i])) return true;
        }

        return false;
    } 
}