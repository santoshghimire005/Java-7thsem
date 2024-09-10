package loops;
//Take integer inputs till the user enters 0 and print the largest number from all
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num;
        int largest=0;


        while((num=input.nextInt())!=0){
            if(num>largest)
            largest=num;
        }
        System.out.println("the largest number is " +largest);
    }
}
