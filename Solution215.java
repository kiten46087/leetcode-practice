import java.util.Collections;
import java.util.PriorityQueue;

public class Solution215 {
    public int findKthLargeast(int[] nums, int k) {

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (pq.size() < k) {
        //         pq.add(nums[i]);
        //     } else {
        //         if (nums[i] > pq.peek()) {
        //             pq.remove();
        //             pq.add(nums[i]);
        //         }
        //     }
        // }
        // return pq.remove();


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            pq.add(num);
        }

        int count = 0;
        int res = 0;
        while (count < k) {
            res = pq.poll();
            count += 1;
        }

        return res;
    }
}