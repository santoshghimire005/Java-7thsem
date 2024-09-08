package practice;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter two numbers");
        int a= input.nextInt();
        int b= input.nextInt();
        System.out.println("enter the operator among (+, -, *, /)");
        char c= input.next().charAt(0);
        if (c=='/')
        System.out.println("The division value is "+ (a/b));
        else if (c=='+')
        System.out.println("The added value is "+ (a+b));
        else if (c=='/')
        System.out.println("The subtracted value is "+ (a-b));
        else if (c=='*')
        System.out.println("The multiplied value is "+ (a*b));
        else
        System.out.println("please provide a valid operator");
    

    }

}
