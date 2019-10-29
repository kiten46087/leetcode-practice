public class Solution367 {
    public boolean isPerfectSquare(int num) {
        int begin = 0;
        int end = num / 2;

        while (begin <= end) {
            int middle = begin + (end - begin) / 2;
            if (middle * middle == num) {
                return true;
            } else if (middle * middle < num) {
                end = middle - 1;
            } else if (middle * middle > num) {
                begin = middle + 1;
            }
        }
        return false;
    }
}