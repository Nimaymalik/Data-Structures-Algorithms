package Top150Questions;

import java.util.ArrayList;
import java.util.Random;

public class RandomizedSet {

    private static ArrayList<Integer> list;

    // constructor
    public RandomizedSet() {
        list = new ArrayList<>();

    }

    public static boolean insert(int val) {
        if (list.contains(val)) {
            return false;
        }
        list.add(val);
        return true;

    }

    public static boolean remove(int val) {
        if (!list.contains(val)) {
            return false;
        }
        list.remove(Integer.valueOf(val));
        return true;
    }

    public static int getRandom() {
        Random ran = new Random();
        return list.get(ran.nextInt(list.size()));

    }

    public static void main(String[] args) {

        RandomizedSet obj = new RandomizedSet();
        System.out.println(obj.insert(10)); // true
        System.out.println(obj.insert(20)); // true
        System.out.println(obj.insert(10)); // false
        System.out.println(obj.getRandom()); // Randomly 10 or 20
        System.out.println(obj.remove(10)); // true
        System.out.println(obj.remove(10)); // false

    }
}
