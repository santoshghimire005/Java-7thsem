package loops;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        System.out.println("start entering numbers");
        Scanner input= new Scanner(System.in);
        int sum=0;
        int num;
        while((num= input.nextInt())!=0){
            // int num= input.nextInt();
            sum= sum+ num;
           

        }
    System.out.println("the sum of the numbers is "+ sum);
    }
}
