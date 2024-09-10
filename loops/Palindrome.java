package loops;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String name= input.nextLine();
        if (isPalindrome(name)==true)
        System.out.println("The provided string is palindrome");
        else
        System.out.println("The provided string is not palindrome");
    }
    public static boolean isPalindrome(String name){
        int i=0;
        boolean var=true;
        int j=(name.length())-1;
        while(i<j){
            if (name.charAt(i)!=name.charAt(j)){
                var=false;
                break;

            }
            i++;
            j--;

        }
        return var;


    }
}
