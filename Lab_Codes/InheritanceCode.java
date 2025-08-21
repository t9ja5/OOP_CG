/**
 * 1. Define a superclass named Person with attributes and a method displayDetails().
 * 2. Define a subclass named Student that extends Person.
 * 3. Add additional attributes and methods specific to Student.
 * 4. In the main() method, create an object of Student.
 * 5. Call methods of both Student and Person through the subclass object.
 * 6. Compile and run the program.
 */



class Person {
    String name;
    String gender;


    Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    void displayDetails() {
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + gender);
    }
}

class Student extends Person {
    String year;
    String branch;


    Student(String name, String gender, String year, String branch) {
        super(name, gender); 
        this.year = year;
        this.branch = branch;
    }

    void displayStudentDetails() {
        System.out.println("Year   : " + year);
        System.out.println("Branch : " + branch);
    }
}

public class InheritanceCode {
    public static void main(String[] args) {
        Student s = new Student("Tejas", "Male", "SE1", "Computer Engg");

        
        s.displayDetails();
        s.displayStudentDetails();
    }
}
