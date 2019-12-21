public class Solution81 {
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return true;

            // check if the the left side is sorted
            if (nums[mid] > nums[start]) {
                // check if the target is in the left half
                if  (target < nums[mid] && target >= nums[start]) {
                    end = mid;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] < nums[start]) {
                if (target > nums[mid] && target < nums[start]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            } else {
                start += 1;
            }
        }
        return false;
    }
}