import java.util.List;
import java.util.LinkedList;

public class Solution989 {
    public List<Integer> addToArrayForm(int[] A, int K) {
        // Use K the whole as the carry
        LinkedList<Integer> res = new LinkedList<>();

        for (int i = A.length - 1; i >= 0; i--) {
            res.add(0, (A[i] + K) % 10);
            K = (A[i] + K) / 10;
        }

        while (K > 0) {
            res.add(0, K % 10);
            K /= 10;
        }
        return res;
        // int carry = 0;
        // int index = A.length - 1;
        // while (K > 0 || index >= 0) {
        //     int curK = K % 10;
        //     int curA = (index >= 0) ? A[index] : 0;
        //     int sum = (curK + curA + carry) % 10;
        //     carry = (curK + curA + carry) / 10;
        //     index -= 1;
        //     K /= 10;
        //     res.addFirst(sum);
        // }
        // if (carry != 0) res.addFirst(1);

        // return res;
    }
}