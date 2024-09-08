package practice;

import java.util.Scanner;

public class Typecast {
    public static void main(String[] args) {
        Scanner vari = new Scanner(System.in);
        System.out.println("enter the float number");
        float num1= vari.nextFloat();
        System.out.println("the integer value of the float is "+ (int)(num1));

    }
}
