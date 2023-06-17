package UNISH.company;

public class Student {
    static String course;
    String name;
    int Age;
    double GPA;

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

}

