package practice;
import java.util.ArrayList;


    public class ArrayListString {
        public static void main(String[] args) {
            ArrayList <String> numbers= new ArrayList<String>();
            numbers.add("Apple");
            numbers.add("Ball");
            numbers.add("Cat");
            numbers.add("Dog");
            System.out.println("the array list is "+ numbers);
            numbers.remove("cat");
            System.out.println("the array list is "+ numbers);
        }
    }

