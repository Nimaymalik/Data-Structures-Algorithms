package Top150Questions;

import java.util.Arrays;


public class MoveZeros {
    public static void moveZeroes(int[] nums) {
         int i=0;
         int j=0;

         for (int j2 = 0; j2 < nums.length; j2++) {

            if(nums[j2]!=0){
                int temp=nums[i];
                nums[i]=nums[j2];
                nums[j2]=temp;

                i++;
            }
            
         }


        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
        int[] nums = { 0,1,1,0};
        moveZeroes(nums);

    }

}
