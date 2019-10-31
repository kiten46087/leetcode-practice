public class Solution459 {
    public boolean repeatedPattern(String s) {
        if (s == null || s.length() == 0) return true;

        int n = s.length();
        for (int len = 1; len < s.length() / 2; len++) {
            if (n % len != 0) continue;

            String pattern = s.substring(0, len);
            int i = len;
            int j = i + len - 1;
            while (j < n) {
                String substr = s.substring(i, j + 1);
                if (!pattern.equals(substr)) break;
                i += len;
                j += len;
            }

            if (i == n) return true;
        }
        return false;
    }
}