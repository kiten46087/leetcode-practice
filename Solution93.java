import java.util.LinkedList;
import java.util.List;

public class Solution93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new LinkedList<>();
        helper(s, "", res, 0);
        return res;
    }

    public void helper(String s, String temp, List<String> res, int n) {
        if (n == 4) {
            // substring here to get rid of the last '.'
            if (s.length() == 0) res.add(temp.substring(0, temp.length() - 1));
            return;
        }

        for (int k = 1; k <= 3; k++) {
            if (s.length() < k) continue;

            // in the case 010 the parseInt will return len = 2, 
            // where val = 10 but k = 3, skip this
            int val = Integer.parseInt(s.substring(0, k));
            if (val > 255 || k != String.valueOf(val).length()) continue;

            helper(s.substring(k), temp + s.substring(0, k) + ".", res, n + 1);
        }
    }
}