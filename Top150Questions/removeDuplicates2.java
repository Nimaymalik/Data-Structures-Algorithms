package Top150Questions;

public class removeDuplicates2 {
    public static int Duplicates2(int[] nums) {
        int j = 2;
        // checking from index 2
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;

            }

        }

        return j;
    }

    public static void main(String[] args) {
        int[] nums = { 1,1,1,2,2,3 };
        System.out.println(Duplicates2(nums));
    }

}
