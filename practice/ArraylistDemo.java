package practice;
import java.util.ArrayList;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("the array list is "+ numbers);
        numbers.remove(0);
        System.out.println("the array list is "+ numbers);.
    }
}
