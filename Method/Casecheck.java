package Method;
import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.println("Please enter an alphabet");
       char ch= input.next().trim().charAt(0);
       if (ch>='a'&& ch<='z')
       System.out.println("The entered  character is lower case");
       else if (ch>='A'&& ch<='Z')
       System.out.println("The entered character is upper case.");
       else
       System.out.println("please enter a valid alphabet");
 
    }
}
