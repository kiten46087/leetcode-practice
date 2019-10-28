import java.util.HashMap;
import java.util.Map;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        // Method2: using array lisy to represent hashmap
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        int length = sArray.length;
        if (length != tArray.length) return false;

        char[] sm = new char[256];
        char[] tm = new char[256];

        for (int i = 0; i < length; i++) {
            char sc = sArray[i];
            char tc = tArray[i];
            if (sm[sc] == 0 && tm[tc] == 0) {
                sm[sc] = tc;
                tm[tc] = sc;
            } else {
                if (sm[tc] != tc || tm[tc] != sc) {
                    return false;
                }
            }
        }
        return true;

        // Method1: using HashMap    
        // Map<Character, Character> map = new HashMap<>();
        // for (int i = 0; i < s.length(); i++) {
        //     Character tempS = s.charAt(i);
        //     Character tempT = t.charAt(i);

        //     if (map.containsKey(tempS)) {
        //         if (map.get(tempS).equals(tempT)) {
        //             continue;
        //         } else {
        //             return false;
        //         }
        //     } else {
        //         if (!map.containsValue(tempT) {
        //             map.put(tempS, tempT);
        //         } else {
        //             return false;
        //         }
        //     }
        // }
        // return true;
    }
}