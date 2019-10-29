import java.util.HashMap;

public class Solution290 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map.containsKey(pattern.charAt(i))) {
                if (map.get(pattern.charAt(i)).equals(words[i])) {
                    continue;
                } else {
                    return false;
                }
            } else {
                if (map.containsValue(words[i])) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), words[i]);
                }
            }
        }
        return true;
    }
}