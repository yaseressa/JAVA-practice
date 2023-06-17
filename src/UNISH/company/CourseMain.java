package UNISH.company;
public class CourseMain{
    public static void main(String[] args) {
        var course1 = new Course("Data Structures");
        var course2 = new Course("Database Systems");
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne kennedy");
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        System.out.println("Number of Students in Course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for(int i = 0;i < course1.getNumberOfStudents();i++){
            System.out.print(students[i] + ", ");
        }
            System.out.println();
            System.out.println("Number of Students in Course2: " + course2.getNumberOfStudents());
        String[] students2 = course2.getStudents();
        for(int i = 0;i < course2.getNumberOfStudents();i++){
            System.out.print(students2[i] + ", ");
        }
    }
}
class Course {
    private final String courseName;
    private final String[] students = new String[100];
    private int numberOfStudents;
    Course(String courseName){
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return numberOfStudents;
    }
    public String getCourseName(){
        return courseName;
    }

}
