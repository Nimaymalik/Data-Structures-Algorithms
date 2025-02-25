package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(s.charAt(i)) || map.get(s.charAt(i)) < left) {
                map.put(s.charAt(i), i);
                maxLen = Math.max(maxLen, i-left+1);
            }else{
                left=map.get(s.charAt(i))+1;
                map.put(s.charAt(i),i);
            }

        }
        return maxLen;

    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

}
