package UNISH.company;

public class A {
    public static int a = 10;
    public A(){
        System.out.println("superclass's constructor");
    }
    public static void display(){
        System.out.println("superclass's Method");
    }
}
class B extends A{
    public B(){
        super();

    }

    public static void main(String[] args) {
        new B();
        display();
    }
    public static void display(){
        System.out.println("subclass's Method");
    }
}
