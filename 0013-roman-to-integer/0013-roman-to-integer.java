import java.util.*;

class Solution {
    private static Map<Character, Integer> m = new HashMap<>();
    static {
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
    }

    public int romanToInt(String s) {
        char[] c = s.toCharArray();

        int sum = m.get(c[c.length - 1]);

        for (int i = c.length - 2; i >= 0; i--) {
            if (m.get(c[i]) < m.get(c[i + 1])) {
                sum -= m.get(c[i]);
            } else {
                sum += m.get(c[i]);
            }
        }

        return sum;
    }
}