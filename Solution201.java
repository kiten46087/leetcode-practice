public class Solution201 {
    public int range(int m, int n) {
        if (m == 0) return 0;
        int count = 0;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            count += 1;
        }

        return (m << count);
    }
}