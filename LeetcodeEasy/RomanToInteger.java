import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {

        // using hashmap
        Map<Character, Integer> hashmap = new HashMap<>();
        hashmap.put('I', 1);
        hashmap.put('V', 5);
        hashmap.put('X', 10);
        hashmap.put('L', 50);
        hashmap.put('C', 100);
        hashmap.put('D', 500);
        hashmap.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            if (hashmap.get(s.charAt(i)) < hashmap.get(s.charAt(i + 1))) {
                res -= hashmap.get(s.charAt(i));

            } else {
                // String =I I I
                res += hashmap.get(s.charAt(i));// 1

            }

        }
        return res + hashmap.get(s.charAt(s.length() - 1));

    }

    public static void main(String[] args) {

        String s = "III";
        System.out.println(romanToInt(s));

    }

}
