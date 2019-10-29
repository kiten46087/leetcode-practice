import java.util.HashMap;
import java.util.Map;

public class Solution299 {
    public String getHint(String secret, String guess) {
        // Methods using hashMap
        // Map<Integer, Character> map = new HashMap<>();
        // int bull = 0;
        // for (int i = 0; i < secret.length(); i++) {
        //     if (secret.charAt(i) == guess.charAt(i)) 
        //         bull += 1;
        //     map.put(i, secret.charAt(i));
        // }

        // int cow = 0;
        // for (int i = 0; i < guess.length(); i++) {
        //     if (map.containsValue(guess.charAt(i)) {
        //         map.values().remove(guess.charAt(I))
        //         cow += 1;
        //     }
        // }

        // TO DO

        // Methods using array to find the cows
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) bulls += 1;
            else {
                if (numbers[secret.charAt(i) - '0']++ < 0) cows += 1;
                if (numbers[guess.charAt(i) - '0']-- > 0) cows += 1;
            }
        }
        return  bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        Solution299 res = new Solution299();
        System.out.println(res.getHint("1123", "0111"));
    }
}