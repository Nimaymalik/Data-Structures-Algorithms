import java.util.Scanner;

public class palinString {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String palin=sc.next();

        if(palin.trim().isEmpty()){
            System.out.println("Mirror is not fun");
        }
        else{
            StringBuilder builder=new StringBuilder(palin);
            builder.reverse();
            if(palin.equals(builder.toString())){
                System.out.println("Mirror is fun");
            }else{
                System.out.println("Mirror is not fun");
            }
        }
        sc.close();



    }
}