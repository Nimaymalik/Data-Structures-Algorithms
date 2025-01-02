package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class fileHandling {
    public static void main(String[] args) {
        try (InputStreamReader inp = new InputStreamReader(System.in)) {

            System.out.print("Enter some letters:");
            int letters = inp.read();
            System.out.println("letters:" + letters);
            while (inp.ready()) {
                System.out.println((char) letters);
                letters = inp.read();

            }
            System.out.println(" ");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader fr = new FileReader("note.txt")) {
            int letters = fr.read();
            while (fr.ready()) {
                System.out.println((char) letters);
                letters = fr.read();
            }
            System.out.println(" ");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("You typed " + br.readLine());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("hello");
            osw.write(34);
            osw.write('A');
            osw.write(54);
            char[] arr = "hello world".toCharArray();

            osw.write(arr);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // fileWriter
        try (FileWriter fr = new FileWriter("note.txt")) {
            fr.write("chumtiya  how are you my name is nimay malik");
            System.out.println(fr.toString());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
