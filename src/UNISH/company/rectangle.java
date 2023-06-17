package UNISH.company;

public class rectangle {
    double height, width;

    rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width * height);
    }
}
