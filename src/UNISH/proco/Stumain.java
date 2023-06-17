package UNISH.proco;
import java.util.Scanner;
public class Stumain {
    public static void main(String[] args) {
        var f = new Scanner(System.in);
        System.out.println("Enter the Course Name: ");
        String Course = f.nextLine();
        var student1 = new Student(Course);
        student1.name = "Ahmed";
        student1.Age = 25;
        student1.GPA = 3.75;
        student1.printInfo();

        var student2 = new Student(Course);
        student2.name = "Omer";
        student2.Age = 15;
        student2.GPA = 3.00;
        student2.printInfo();
        var student3 = new Student();
        student3.name = "eman";
        student3.Age = 19;
        student3.GPA = 3.3;
        student3.printInfo();

    }
}
