package StringBuffer;

import java.util.Random;

public class randomString {

    static String generate(int size) {

        StringBuffer buffer = new StringBuffer(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            int randomChar = 97 + (int) (rand.nextFloat() * 26);
            buffer.append((char) randomChar);

        }
        return buffer.toString();

    }
}
