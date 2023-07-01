public class Solution {
    public static String[] capitalize(String s) {
        String[] result = new String[2];
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                even.append(Character.toUpperCase(c));
                odd.append(Character.toLowerCase(c));
            } else {
                even.append(Character.toLowerCase(c));
                odd.append(Character.toUpperCase(c));
            }
        }

        result[0] = even.toString();
        result[1] = odd.toString();

        return result;
    }

    public static void main(String[] args) {
        String s = "abcdef";
        String[] result = capitalize(s);
        System.out.println("Even: " + result[0]);
        System.out.println("Odd: " + result[1]);
    }
}