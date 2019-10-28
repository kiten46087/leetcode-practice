public class Solution190 {
    public int reverseBit(int n) {
        if (n == 0) return 0;
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = result << 1;
            if ((n & 1) == 1) result += 1;
            n = n >> 1;
        }

        return result;
    }
}