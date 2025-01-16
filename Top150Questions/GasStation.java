package Top150Questions;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas = 0;
        int total_cost = 0;

        // checking the total cost and total gas
        for (int i = 0; i < gas.length; i++) {
            total_gas += gas[i];
            total_cost += cost[i];

        }

        if (total_cost > total_gas) {
            return -1;
        }

        int pos = 0;
        int sum = 0;

        //checking if the sum is positive or negative
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0) {
                sum = 0;
                pos++;
            }

        }
        return pos;

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 3, 4, 5, 1, 2 };

        System.out.println(canCompleteCircuit(a, b));

    }

}
