package loops;

public class Reverse {
    public static void main(String[] args) {
        int num=807382168;
        int sum=0;
        
        while(num!=0)
        {
            int var=num%10;
            sum=sum*10+var;
            num=num/10;
        }
        System.out.println("the reverse is "+ sum);
    }
}
