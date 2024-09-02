package practice;

public class InterfaceClass {
    public static void main(String[] args) {
    A a= new A();
    a.print();
    a.show();
    
   
}
}
class A implements printable, showable{
    public void print(){
        System.out.println("Hello! I am print");
    }

    public void show(){
        System.out.println("welcome to show ");
        
    }
}
   interface printable{
    void print();
}
interface showable{
    void show();
}
    



