public class Solution461 {
    public int hamming(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            int n1 = x == 0 ? 0 : (x & 1);
            int n2 = y == 0 ? 0 : (y & 1);

            if (n1 != n2) count += 1;
            x = x >> 1;
            y = y >> 1;
        }
        return count;

        // Using built-in function which is bit count
        // return Integer.bitCount(x ^ y);
    }   
}