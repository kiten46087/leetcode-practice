public class Solution405 {
    public String toHex(int num) {
        char[] array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                        'a', 'b', 'c', 'd', 'e', 'f'};
        if (num == 0) return "0";
        String result = "";
        while (num != 0) {
            result += array[(num & 15)];
            num = (num >>> 4);
        }
        return result; 
    }
}