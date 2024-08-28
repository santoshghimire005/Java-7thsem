public class StudentDemo {
    public static void main(String[] args) {
        Student s0 = new Student(1, "santosh", "mahaboudha", "9861283708", new Dob(11,15,2057) );
        s0.displayInfo();
    System.out.println(s0);

    }

}

class Student {
    private int id;
    private String name;
    private String address;
    private String phone;
    private Dob dob;

    public Student() {

    }

    public Student(int id, String name, String address, String phone, Dob dob) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.dob = dob;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Id = " + id);
        System.out.println("Name = " + name);
        System.out.println("Address = " + address);
        System.out.println("phone number = " + phone);
        System.out.println("Date of birth = " + dob.printDob());
        System.out.println("Name = " + name);
    }
    @Override
    public String toString()
    {
        return "id= "+id +"\n" +
        "name ="+name + "\n" +
        "Address ="+address+ "\n" +
        "phone number ="+phone+ "\n" +
        "Date of birth ="+ dob.printDob()+"\n";
        
    }



}

class Dob {
    int month, day, year;

    public Dob(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String printDob() {
        return day + "/" + month + "/" + year;

    }
}