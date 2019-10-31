

public class Solution434 {
    public int countSegment(String s) {
        // Use built-in function
        // String trimmed = s.trim();
        // if (trimmed.equals("")) {
        //     return 0;
        // }

        // return trimmed.split("\\s+").length;

        // Use count and in-place method
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                count += 1;
            }
        }
        return count;
    }
}