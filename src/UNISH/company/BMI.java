package UNISH.company;
import java.util.Scanner;
public class BMI {
    private final String name ;
    private final double weight;
    private final double height;
    BMI(String name, double weight, double height){

        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public String getBMI(){
        double bmi = weight / (height * height);
        if(bmi < 18.5)
            return "your BMI is: "+bmi +"\nYou are Under-weight";
        else if(bmi > 18.5 && bmi < 24.9)
            return "your BMI is: "+bmi +"\nYou are a Normal Being";
        else if (bmi > 24.9 && bmi < 30)
            return "your BMI is: "+bmi +"\nYou are an Over-weight";
        else
            return "your BMI is: "+bmi +"\nYou are an Obese";

    }
}
class BmiMain{
    public static void main(String[] args) {
        var b = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = b.nextLine();
        System.out.print("Enter your Weight: ");
        double weight = b.nextDouble();
        System.out.print("Enter your Height: ");
        double height = b.nextDouble();
        var per1 = new BMI(name, weight, height);
        System.out.println(
                per1.getBMI()
        );
    }
}