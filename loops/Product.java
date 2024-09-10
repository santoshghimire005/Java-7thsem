package loops;
// Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter the number");
        int num= input.nextInt();
        int num1=num;
        int product=1;
        int sum=0;
        int var;
        while (num1!=0) {
            var= num1%10;
            sum= sum+var;
            product=product*var;
            num1=num1/10;
        }
        System.out.println("The differnce betn  product and sum is "+ (product-sum));

        
        

    }}
