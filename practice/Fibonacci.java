package practice;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the nth number you want fibonacci series upto");
        int num= input.nextInt();
        int previous=0;
        int current=1;
        int next=0;
        if(num<=2){
            if (num==1)
            System.out.println(0);
            else if(num==2)
            System.out.println(0+" \n"+1);
        }
        else{
            System.out.println(0 +"\n"+1);
        while (num!=0) { 
         if (num>2){

               next= previous+ current;
               previous=current;
               current=next;
               System.out.println(next);

            }

            
            num=num-1;
        }}
    }
}
