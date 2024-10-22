package queueLeetcode;
class Solution {
    public int minInsertions(String s) {
        int leftCount = 0; 
        int insertions = 0; 
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            
            if (ch == '(') {
                leftCount++;
            } else {
             
                if (leftCount > 0) {
                    leftCount--;
                } else {
               
                    insertions++;
                }
                
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; 
                } else {
                    insertions++; 
                }
            }
        }

        insertions += leftCount * 2;
        
        return insertions;
    }
}
