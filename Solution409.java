// import java.util.HashMap;

public class Solution409 {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) {
            count[c] += 1;
        }
        int ans = 0;
        for (int v : count) {
            ans += (v / 2) * 2;
            if (ans % 2 == 0 && v % 2 == 1) ans += 1;
        }
        return ans;
        // My method using HashMap
        // if (s.length() == 0 || s == null) return 0;
        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < s.length(); i++) {
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }

        // boolean addOne = false;
        // int count = 0;
        // for (Integer num : map.values()) {
        //     if (num % 2 == 0) {
        //         count += num;
        //     }
        //     if (num % 2 != 1) {
        //         count += (num / 2) * 2;
        //         addOne = true;
        //     }
        // }
        // if (addOne) count += 1;
        // return count;
    }
}