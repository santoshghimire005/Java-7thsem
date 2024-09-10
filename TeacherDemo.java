public class TeacherDemo {

    public static void main(String[] args) {
        Dob dob = new Dob(15, 11, 2057);
        Teacher t = new Teacher(25, 2000, "santosh", "intern",dob);
        t.display();

    }
}

class Teacher {
    int age;
    int salary;
    String name;
    String designation;
    Dob dob;

    public Teacher(int age, int salary, String name, String designation, Dob dob) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.designation = designation;
        this.dob = dob;
    }

    void display() {
        System.out.println("The age of the teacher is " + age + " yrs");
        System.out.println("The salary of the teacher is NRS" + salary + "");
        System.out.println("The name of the teacher is " + name + "");
        System.out.println("The designation of the teacher is " + designation + "");
        System.out.println("The date of birth of the teacher is " + dob.Dobprint() + "");

    }

}

class Dob {
    int day;
    int month;
    int year;

    public Dob(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String Dobprint() {
        return (year + "/" + month + "/" + day);
    }

}
