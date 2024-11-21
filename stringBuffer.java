package StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class stringBuffer {
    public static void main(String[] args) {

        // constructor 1
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        sb.append("nimaymalik");
        sb.append(" is nice");
        // sb.insert(2, "Rahul");

        // sb.replace(0,10,"Nimay");
        // sb.delete(0,10);
        // sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = randomString.generate(n);
        System.out.println(name);

        // remove spaces
        String sentense = "my name is nimay and i am the cute guy ";
        System.out.println(sentense.replaceAll("\\s", ""));

        // split the sentence
        String names = "nimay amit rahul kunal";
        String[] arr = names.split(",");
        System.out.println(Arrays.toString(arr));

        //rounding off

        DecimalFormat df=new DecimalFormat("0.000");
        System.out.println(df.format(7.2));

    }

}
