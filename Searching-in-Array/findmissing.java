
public class findmissing {
    public static void main(String[] args) {
        int[] arr = { 4, 0, 2, 1 };


        
 
        findMissing(arr);

    }

    static void findMissing(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                System.out.println(i + "");

            }

        }

    }


}
