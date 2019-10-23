class Solution415 {
    public String addString(String num1, String num2) {
        int i = num1.length();
        int j = num2.length();
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int n1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int n2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = (n1 + n2 + carry) % 10;
            carry = (n1 + n2 + carry) / 10;
            res.append(sum);
            i -= 1;
            j -=1;
        }
        if (carry == 1) {
            res.append("1");
        }
        return res.reverse().toString();
    }
}