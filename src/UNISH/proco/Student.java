package UNISH.proco;
public class Student {
    static String course;
    String name;
    int Age;
    double GPA;
    Student(){

    }
    Student(String Course) {
        course = Course;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int Age){
        this.Age = Age;
    }
    void setGPA(double GPA){
        this.GPA = GPA;
    }
    void printInfo(){
        System.out.println(
                "Student Name: " + this.name + "\n"
                        + "Student Age: " + this.Age + "\n"
                        + "Student GPA: " + this.GPA + "\n"
                        + "Student Course: " + Student.course
        );
    }
}