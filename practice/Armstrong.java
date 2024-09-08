package practice;
import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println(" please provide a number");
        int num= input.nextInt();
        int len=0;
        int num1=num;
        int num2=num;
        int sum=0;
        while(num1!=0)
        {
            num1=num1/10;
            len++;

        }
        while(num2!=0){
           int var= num2%10;
           num2=num2/10;
           sum= sum+ (int) Math.pow(var,len);
        }
        System.out.println("The sum is "+sum);
        if (sum==num)
        System.out.println("its an armstrong number");
        else
        System.out.println("The number is not armstrong");

    

     }
}
