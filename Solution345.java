public class Solution345 {
    public String reverseVowels(String s) {
        if (s == null || s.length() == 0) return null;
        String vowels = "aeiouAEIOU";
        char[] array = s.toCharArray();
        int begin = 0;
        int end = s.length() - 1;

        while (begin < end) {
            while (begin < end && !vowels.contains(array[begin] + "")) {
                begin += 1;
            }
            
            while (begin < end && !vowels.contains(array[end] + "")) {
                end -= 1;
            }

            char temp = array[begin];
            array[begin] = temp;
            array[end] = temp;

            begin += 1;
            end -= 1;
        }

        return new String(array);
    }
}