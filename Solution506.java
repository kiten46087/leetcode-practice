import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class Solution506 {
    public String[] findRelativeRanks(int[] nums) {
        int[] ranks = nums.clone();

        Arrays.sort(ranks);
        Map<Integer, Integer> map = new HashMap<>(); 
        for (int i = 0; i < ranks.length; i++) {
            map.put(ranks[i], ranks.length - i);
        }

        String[] res = new String[ranks.length];
        for (int i = 0; i < ranks.length; i++) {
            int rank = map.get(i);
            String rankS = rank + "";
            if (rank == 1) rankS = "Gold Medal";
            else if (rank == 2) rankS = "Silver Medal";
            else if (rank == 3) rankS = "Bronze Medal";
            res[i] = rankS;
        }
        
        return res;
    }
}