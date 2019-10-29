public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] chart = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            chart[magazine.charAt(i) - 'a'] += 1;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if (--chart[ransomNote.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}