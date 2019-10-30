public class Solution392 {
    public boolean isSubsequence(String s, String t) {
        // Using str.indexOf() method
        int start = -1;
        for (int i = 0; i < s.length();  i++) {
            if (t.indexOf(s.charAt(i), start + 1) == -1 ) {
                return false;
            }
            start = t.indexOf(s.charAt(i), start + 1);
        }
        return true;
        

        // Newer version of the two pointer technique
        // if (s.length() > t.length()) return false;
        // int i = 0;
        // int j = 0;

        // for (int k = 0; k < t.length(); k++) {
        //     if (s.charAt(i) == t.charAt(j)) {
        //         i += 1;
        //         if (i == s.length()) return true;        
        //     }
        //     j += 1;
        // }
        // return false;

        // My old version of Two pointer
        // int count = 0;
        // while (j < t.length() && i < s.length()) {
        //     while (j <= t.length() - 1 && s.charAt(i) != t.charAt(j)) {
        //        j += 1;
        //     }
        //     if (j == t.length()) break;
        //     if (s.charAt(i) == t.charAt(j)) {
        //         count += 1;

        //         i += 1;    
        //         j += 1;
        //     }
        // }
        // return count == s.length();

    }
}