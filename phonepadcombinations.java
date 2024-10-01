package leetcode;

import java.util.ArrayList;

public class phonepadcombinations {
    public static void main(String[] args) {
       ArrayList<String> ans= pad("", "12");
       System.out.println(ans);

    }

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }
        int digit = up.charAt(0) - '0';// convert '2' into 2
        ArrayList<String> ans=new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(pad(p+ch, up.substring(1)));
        }
        return ans;
    }
}
