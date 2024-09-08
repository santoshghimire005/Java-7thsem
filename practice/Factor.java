package practice;
//program to take an number as an input and print all its factors
import java.util.Scanner;
public class Factor {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    int num= input.nextInt();
    int fact= 1;
    System.out.println("The factors of the number are ");
    while (fact<=num){
        if (num%fact==0)
        System.out.println(" "+fact);
        fact++;

    }
}}
    
    

