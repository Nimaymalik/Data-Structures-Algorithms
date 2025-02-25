package SlidingWindow;

public class minimumSizeSubarray {
    public static int minSubArrayLen(int target, int[] nums) {
        int left=0; //left pointer of sliding window
        int currSum=0; //currSum in the window
        int minlen=Integer.MAX_VALUE; //minimum len initialised to max value

        System.out.println(minlen);
        for (int i = 0; i < nums.length; i++) {
            currSum+=nums[i];
            while(currSum>=target){
                minlen=Math.min(minlen, i-left+1);
                currSum-=nums[left];
                left++;
            }
        }
        if(minlen == Integer.MAX_VALUE){
            return 0;
        }
        return minlen;


    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 4 };
        int target = 4;

        System.out.println(minSubArrayLen(target, nums));

    }

}
