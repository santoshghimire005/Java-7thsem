package loops;
import java.util.Scanner;
public class Perfect {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        int fact=1;
        int sum=0;
        while (fact<num) {
            if (num%fact==0){
                sum=sum+fact;
                System.out.println(" "+fact);
            }
            fact++;
        }
        if (sum==num)
        System.out.println("the number is perfect");
        else
        System.out.println("the number is not perfect");

    }
}
