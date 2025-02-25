package SlidingWindow;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        String ans = "";
        int slen = s.length();
        int tlen = t.length();

        if (slen < tlen) {
            return "";
        } else if (slen == tlen) {
            return s;
        } else if (slen > tlen) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : t.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);

            }
            int start = 0;
            int end = 0;
            int minLen = Integer.MAX_VALUE;
            int startInd = 0;

            char[] chs = s.toCharArray();
            while (end < chs.length) {
                if (map.containsKey(end)) {
                    if (map.get(chs[end]) > 0) {
                        tlen--;
                    }
                    map.put(chs[end], map.get(chs[end]) - 1);

                }
                end++;
                while(tlen ==0){
                    if(end-start<minLen){
                        minLen=end-start;
                        startInd=start;
                    }
                }

            }

        }
        return ans;

    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";

        System.out.println(minWindow(s, t));

    }

}
