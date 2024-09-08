package ExceptionHandlingDemo;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int result;
        try {
            result = x / y;
            System.out.println("result = " + result);
        } catch (ArithmeticException a) {
            System.out.println("The error is " + a);

        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }

        WriteFile();

        System.out.println("Test");
    }

    public static void WriteFile() {

        try (FileWriter fw = new FileWriter("abc.txt")) {

            fw.write("Welcome to \n Advance Java Programming !!!");

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
