public class Solution717 {
    public boolean isOneBitCharacter(int[] bits) {
        // solution 1 using pointer
        // int n = bits.length;
        // int i = 0;
        // while (i < n - 1) {
        //     if (bits[i] == 0) i += 1;
        //     else if (bits[i] == 1) i += 2;
        // }
        // if (i == n - 1) return true;
        // else return false;

        int n = bits.length;
        int i = n - 2;
        while (i >= 0 && bits[i] > 0) i -= 1;
        return (bits.length - i) % 2 == 0;
    }

    public static void  main(String[] args) {
        int[] input = new int[] {1, 1, 1, 0};
        Solution717 test = new Solution717();
        System.out.println(test.isOneBitCharacter(input));
    }
}