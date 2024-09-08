package ExceptionHandlingDemo;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int result;
        int a[][] = { { 1, 2, 3 }, { 5, 6, 7 }, { 8, 9, 10 } };
        try {
            result = x / y; // throw new ArithmeticException()
            System.out.println("Result : " + result);

            for (int i = 0; i <= a.length; i++) {

                System.out.println(a[i][i]);
            }

        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }

        writeFile();

        System.out.println("Test");
    }

    public static void writeFile() {

        try (FileWriter fw = new FileWriter("abc.txt")) { // try with resource

            fw.write("Welcome to \n Advance Java Programming !!!! ");

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
