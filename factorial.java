
public class factorial {
    public static void main(String[] args) {

        System.out.println(factor(-2));
    }

    static int factor(int num) {
        // num=5
        int ans = 1;

        if (num == 0 || num == 1) {
            return 1;
        } else if (num < 0) {
            return -1;

        }

        while (num != 0) {
            ans *= num;
            num--;

        }

        return ans;
    }
}