package loops;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
       System.out.println("The average of the entered number is "+sum());
    }
    public static int sum(){
        int num;
        int total=0;
        int count=0;
        Scanner input= new Scanner(System.in);
        while(( num=input.nextInt())!=0){
            total= total+num;
            count++;

        }
        return (total/count);
    }
    
}

