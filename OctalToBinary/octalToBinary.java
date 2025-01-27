package OctalToBinary;

public class octalToBinary {

    public static int octalBinary(int n) {

        int size = 0;
        int ans = 0;
        while (n != 0) {
            int d = n % 10;
            n = n / 10;
            ans += d * Math.pow(8, size);
            size++;

        }
        return ans;

    }

    public static void main(String[] args) {
        int n = 140;
        System.out.println(octalBinary(n));

    }

}
